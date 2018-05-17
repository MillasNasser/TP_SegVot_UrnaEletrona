<<<<<<< Updated upstream:src/tp/seguraça/Urna/Candidato.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.seguraça.Urna;

import tp.seguraça.Pessoa;

/**
 *
 * @author rafael
 */
public class Candidato extends Pessoa {
    private final int Numero;
    private final String Partido;
	private long Votos;

    public Candidato(String nome, int numero, String Partido) {
        super(nome);
        this.Numero = numero;
        this.Partido = Partido;
    }

    public int getNumero() {
        return Numero;
    }

    public String getPartido() {
        return Partido;
    }
	
	public void addVoto(){
		this.Votos++;
	}
	
	public long getVoto(){
		long valor = Votos;
		return valor;
	}

	@Override
	public String toString() {
		String candidato = "";
		candidato = getNome()+ " " + getNumero()+"\n";
		candidato = Partido+"\n";
		return candidato;
	}
}
=======
>>>>>>> Stashed changes:src/tp/seguraça/Candidato.java
