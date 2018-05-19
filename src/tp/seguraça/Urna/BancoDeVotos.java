package tp.seguraça.Urna;

import java.util.Vector;

/**
 * 
 * Singleton
 */
public final class BancoDeVotos{
	private static final BancoDeVotos INSTANCE = new BancoDeVotos();
    private static Vector<Candidato> candidatos;
    private static final Candidato NULO = new Candidato("nulo", -2, "");
	private static final Candidato BRANCO = new Candidato("branco", -1, "");
	
	
    private BancoDeVotos(){
        candidatos = new Vector<>();
		addCandidato(NULO);
		addCandidato(BRANCO);
    }

	public static BancoDeVotos getInstance(){
		return INSTANCE;
	}
	
	public static boolean addVoto(Candidato candidato){
		boolean adicionou = false;
		int index = candidatos.indexOf(candidato);
		if(index != -1){
			Candidato c= candidatos.get(index);
			c.addVoto();
		}
		return adicionou;
	}
	
	public static void addCandidato(Candidato novo){
		candidatos.add(novo);
	}
	
	public static void removeCandidato(Candidato novo){
		candidatos.remove(novo);
	}
}


