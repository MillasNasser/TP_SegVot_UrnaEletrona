package tp.seguraça;


import java.util.Vector;
import tp.seguraça.Candidato;
import tp.seguraça.Pessoa;


public class BancoDeVotos{    
    private Vector<Candidato> candidatos;
    
    public BancoDeVotos(){
        candidatos = new Vector<>();
    }

    public Vector<Candidato> getCandidatos() {
        return candidatos;
    }
}


