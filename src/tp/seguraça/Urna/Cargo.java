/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.seguraça.Urna;

import java.util.Vector;

/**
 * @author rafael
 */
public class Cargo {
    private Vector<Candidato> listaCandidato;
    private String nome;
    
    public Cargo(String nome){
        this.nome = nome;
        listaCandidato = new Vector<>();
    }
	
	public Candidato getCandidato(long numeroEleitoral) throws CloneNotSupportedException{
		Candidato retorno = null;
		for(Candidato candt: listaCandidato){
			if(candt.getNumero() == numeroEleitoral){
				try{
					retorno = candt.clone();
				}catch(CloneNotSupportedException e){
					System.out.println("Não foi possível clonar o Candidato ");
					e.printStackTrace();
				}
			}
		}
		return retorno;
	}

    public String getNome() {
        return nome;
    }
    
    public void adicionaCandidato(Candidato novoCandidato){
		boolean inserir = true;
		for(Candidato candt: listaCandidato){
			if(candt.getNumero() == novoCandidato.getNumero()){
				inserir = false; break;
			}
		}
		if(inserir){
			this.listaCandidato.add(novoCandidato);
			BancoDeVotos.addCandidato(novoCandidato);
		}
    }
    
    public void removeCandidato(Candidato novoCandidato){
        this.listaCandidato.remove(novoCandidato);
    }
	
	public void remCandidatoDB(Candidato novoCandidato){
		this.listaCandidato.remove(novoCandidato);
		BancoDeVotos.removeCandidato(novoCandidato);
	}
}
