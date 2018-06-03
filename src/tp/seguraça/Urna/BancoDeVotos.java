package tp.seguraça.Urna;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 * Singleton
 */
public final class BancoDeVotos{
	private static final BancoDeVotos INSTANCE = new BancoDeVotos();
    private static ArrayList<Candidato> candidatos;
	
    private BancoDeVotos(){
        candidatos = new ArrayList<>();
    }

	public static BancoDeVotos getInstance(){
		return INSTANCE;
	}
	
	public static boolean addVoto(Candidato candidato){
		boolean adicionou = false;
		for(Candidato c: candidatos){
			if (c.equals(candidato)){
				c.addVoto();
				adicionou = true;
				break;
			}
		}
		return adicionou;
	}
	
	public static void addCandidato(Candidato novo){
		candidatos.add(novo);
	}
	
	public static void removeCandidato(Candidato novo){
		candidatos.remove(novo);
	}
	
	public static String geraBoletim(){
		String boletim = "";
		for (Candidato candidato: candidatos){
			boletim += candidato.toString();
			boletim += candidato.getVoto()+"\n";
			boletim += "-----------------------------";
		}
		return boletim;
	}
	
	public static void finalizar(){
		final String hash, boletim;
		
		hash = generateHash(geraBoletim());
		boletim = geraBoletim();
		System.out.println(hash);
	}
	
	/* Procedimentos de finalização */
	private static String generateHash(String boletim){		
		MessageDigest digest = null;
		try {
			digest = MessageDigest.getInstance("SHA-512");
		} catch (NoSuchAlgorithmException ex) {
			System.out.println(ex.getMessage());
		}
		byte[] hashCode;
		hashCode = digest.digest(boletim.getBytes(StandardCharsets.UTF_8));
		
		StringBuilder hexString = new StringBuilder();

        for (int i = 0; i < hashCode.length; i++) {
            String hex = Integer.toHexString(0xff & hashCode[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
		
		return hexString.toString();
	}
}


