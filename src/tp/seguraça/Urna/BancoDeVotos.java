package tp.seguraça.Urna;

import java.util.Vector;
import tp.seguraça.Urna.Candidato;


public class BancoDeVotos{    
    private Vector<Candidato> candidatos;
    
    public BancoDeVotos(){
        candidatos = new Vector<>();
    }

    public Vector<Candidato> getCandidatos() {
        return candidatos;
    }
	
	public boolean addVoto(){
		return true;
	}
}


