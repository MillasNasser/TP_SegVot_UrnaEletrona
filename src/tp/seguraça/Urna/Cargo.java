/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.seguraça.Urna;

import java.util.HashMap;

/**
 * @author rafael
 */
public class Cargo {
    private final HashMap<Long, Candidato> listaCandidato;
    private final String nome;
    
    public Cargo(String nome){
        this.nome = nome;
        listaCandidato = new HashMap<>();
    }
	
	public Candidato getCandidato(Long numeroEleitoral) throws CloneNotSupportedException{
		Candidato retorno;
		retorno = listaCandidato.getOrDefault(numeroEleitoral,null);
		if(retorno != null){
			retorno = retorno.clone();
		}
		return retorno;
	}

    public String getNome() {
        return nome;
    }
    
    public void adicionaCandidato(Candidato novoCandidato){
		boolean inserir;
		inserir = listaCandidato.get(novoCandidato.getNumero()) == (null);
		if(inserir){
			System.out.printf("%20s %d %s\n", this.getNome(), novoCandidato.getNumero(), "Jorgim "+this.getNome().substring(0, 4));
			this.listaCandidato.put(novoCandidato.getNumero(),
									novoCandidato);
			BancoDeVotos.addCandidato(novoCandidato);
		}
    }
    
    public void removeCandidato(Candidato candidato){
        this.listaCandidato.remove(candidato.getNumero());
    }
	
	public void remCandidatoDB(Candidato candidato){
		this.listaCandidato.remove(candidato.getNumero());
		BancoDeVotos.removeCandidato(candidato);
	}
}
