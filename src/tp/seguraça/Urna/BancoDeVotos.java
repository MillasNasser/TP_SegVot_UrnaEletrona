package tp.seguraça.Urna;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import tp.seguraça.Criptografia;

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
			boletim += "-----------------------------\n";
		}
		return boletim;
	}
	
	public static void finalizar(){
		FileOutputStream fos;

		final String hash, boletim;
		hash = Criptografia.generateHash(geraBoletim());
		boletim = geraBoletim();
		try{
			fos = new FileOutputStream("Boletim.voto");
			fos.write((hash+"\n"+boletim).getBytes());
			fos.close();
		}catch(IOException e){}
		try{
			fos = new FileOutputStream("Boletim.voto.hash");
			fos.write(
				Criptografia.encrypt(
					Criptografia.generateHash(hash+"\n"+boletim)
				)
			);
			fos.close();
		}catch(Exception e){}
	}
}


