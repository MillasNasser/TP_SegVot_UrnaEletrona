/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.seguraça;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;

public class Sample {
    
    public static void main(String [] args) throws Exception {
        // generate public and private keys
        KeyPair keyPair = buildKeyPair();
		saveKeys(keyPair);
		keyPair = LoadKeyPair("", "RSA");
        PublicKey pubKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();
		
        // encrypt the message
        byte [] encrypted = encrypt(privateKey, "This is a secret message");     
        System.out.println(new String(encrypted));  // <<encrypted message>>

        // decrypt the message
        byte[] secret = decrypt(pubKey, encrypted);                                 
        System.out.println(new String(secret));     // This is a secret message
    }

    public static KeyPair buildKeyPair() throws NoSuchAlgorithmException {
        final int keySize = 4096;
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(keySize);      
        return keyPairGenerator.genKeyPair();
    }

    public static byte[] encrypt(PrivateKey privateKey, String message) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");  
        cipher.init(Cipher.ENCRYPT_MODE, privateKey);  

        return cipher.doFinal(message.getBytes());  
    }
    
    public static byte[] decrypt(PublicKey publicKey, byte [] encrypted) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");  
        cipher.init(Cipher.DECRYPT_MODE, publicKey);
        
        return cipher.doFinal(encrypted);
    }
	
	public static void saveKeys(KeyPair keyPair) throws FileNotFoundException, IOException{
		PublicKey pub = keyPair.getPublic();
		PrivateKey priv = keyPair.getPrivate();
		
		/* Salvando a chave pública */
		X509EncodedKeySpec x509 = new X509EncodedKeySpec(
				pub.getEncoded());
		FileOutputStream fos = new FileOutputStream("signature.key");
		fos.write(x509.getEncoded());
		fos.close();
		
		/* Salvando a chave privada */
		PKCS8EncodedKeySpec pkcs = new PKCS8EncodedKeySpec(
				priv.getEncoded());
		fos = new FileOutputStream("encript.key");
		fos.write(pkcs.getEncoded());
		fos.close();
	}
	
	public static KeyPair LoadKeyPair(String path, String algorithm)
			throws IOException, NoSuchAlgorithmException,
			InvalidKeySpecException {
		// Read Public Key.
		File filePublicKey = new File(path + "signature.key");
		FileInputStream fis = new FileInputStream(path + "signature.key");
		byte[] encodedPublicKey = new byte[(int) filePublicKey.length()];
		fis.read(encodedPublicKey);
		fis.close();
 
		// Read Private Key.
		File filePrivateKey = new File(path + "encript.key");
		fis = new FileInputStream(path + "encript.key");
		byte[] encodedPrivateKey = new byte[(int) filePrivateKey.length()];
		fis.read(encodedPrivateKey);
		fis.close();
 
		// Generate KeyPair.
		KeyFactory keyFactory = KeyFactory.getInstance(algorithm);
		X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(
				encodedPublicKey);
		PublicKey publicKey = keyFactory.generatePublic(publicKeySpec);
 
		PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(
				encodedPrivateKey);
		PrivateKey privateKey = keyFactory.generatePrivate(privateKeySpec);
 
		return new KeyPair(publicKey, privateKey);
	}
}