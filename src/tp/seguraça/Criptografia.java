/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.seguraça;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/**
 *
 * @author millas
 */
public class Criptografia {
	private static final PublicKey ASSINATURA = ldSignKey();
	private static final PrivateKey ENCRIPTAR = ldEncrpKey();
	
	/* Procedimentos de finalização */
	public static String generateHash(String texto){		
		MessageDigest digest = null;
		try {
			digest = MessageDigest.getInstance("SHA-512");
		} catch (NoSuchAlgorithmException ex) {
			System.out.println(ex.getMessage());
		}
		
		if(digest == null) System.exit(-1);
		byte[] hashCode;
		hashCode = digest.digest(texto.getBytes(StandardCharsets.UTF_8));
		
		StringBuilder hexString = new StringBuilder();

        for (int i = 0; i < hashCode.length; i++) {
            String hex = Integer.toHexString(0xff & hashCode[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
		
		return hexString.toString();
	}
	
	/* Encripta os arquivos com a chave pública (Biblioteca do java chama de privada) */
	public static byte[] encrypt(String message) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");  
        cipher.init(Cipher.ENCRYPT_MODE, ENCRIPTAR);  

        return cipher.doFinal(message.getBytes());  
    }
    
	/* Verifica a assinatura de um arquivo, retornando o seu conteúdo */
    public static byte[] verifySingnature(byte [] encrypted) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");  
        cipher.init(Cipher.DECRYPT_MODE, ASSINATURA);
        
        return cipher.doFinal(encrypted);
    }
	
	public static PublicKey ldSignKey(){
		try{
			KeyFactory factory = KeyFactory.getInstance("RSA");
			File fPubKey = new File("signature.key");
			byte[] enc_pubKey;
			try (FileInputStream fis = new FileInputStream("signature.key")) {
				enc_pubKey = new byte[(int)fPubKey.length()];
				fis.read(enc_pubKey);
			}

			X509EncodedKeySpec spec = new X509EncodedKeySpec(enc_pubKey);
			return factory.generatePublic(spec);
		}catch(IOException | NoSuchAlgorithmException | InvalidKeySpecException e){}
		return null;
	}
	
	public static PrivateKey ldEncrpKey(){
		try{
			KeyFactory factory = KeyFactory.getInstance("RSA");
			File fPriKey = new File("encript.key");
			byte[] enc_pubKey;
			try (FileInputStream fis = new FileInputStream("encript.key")) {
				enc_pubKey = new byte[(int)fPriKey.length()];
				fis.read(enc_pubKey);
			}

			PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(enc_pubKey);
			return factory.generatePrivate(spec);
		}catch(IOException | NoSuchAlgorithmException | InvalidKeySpecException e){}
		return null;
	}
}
