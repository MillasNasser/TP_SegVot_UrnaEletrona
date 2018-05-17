package tp.seguraça.Urna;

import java.util.Vector;

public final class BancoDeVotos{
	private static final BancoDeVotos INSTANCE = new BancoDeVotos();
    private static Vector<Candidato> candidatos;
    private static Candidato nulo = new Candidato("nulo", -2, "");
	private static Candidato branco = new Candidato("branco", -1, "");
	
	
    private BancoDeVotos(){
        candidatos = new Vector<>();
		addCandidato(nulo);
		addCandidato(branco);
    }

	public static BancoDeVotos getInstance(){
		return INSTANCE;
	}
	
    public static Vector<Candidato> getCandidatos() {
        return candidatos;
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
}


