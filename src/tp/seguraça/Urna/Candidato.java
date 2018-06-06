/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.seguraça.Urna;

import java.util.Objects;
import tp.seguraça.Pessoa;

/**
 *
 * @author rafael
 */
public class Candidato extends Pessoa{
    private final long Numero;
    private final String Partido;
	private long Votos;

    public Candidato(String nome, long numero, String Partido) {
        super(nome);
        this.Numero = numero;
        this.Partido = Partido;
    }
	
	private Candidato(String nome, long numero, String Partido, long Votos) {
        super(nome);
        this.Numero = numero;
        this.Partido = Partido;
		this.Votos = Votos;
    }

    public long getNumero() {
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
		String candidato;
		candidato = getNome()+ " " + getNumero()+"\n";
		candidato += Partido+"\n";
		return candidato;
	}
	
	/**
	 *
	 * @return nova instancia de Candidato
	 * @throws CloneNotSupportedException
	 */
	@Override
	public Candidato clone() throws CloneNotSupportedException{
        return new Candidato(getNome(), getNumero(), getPartido(), getVoto());
    }
	
	
	@Override
	public boolean equals(Object o){
		Candidato candidato;
		if(o instanceof Candidato){
			candidato = (Candidato) o;
		}else{
			return false;
		}
		return this.toString().equals(candidato.toString());
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 47 * hash + (int) (this.Numero ^ (this.Numero >>> 32));
		hash = 47 * hash + Objects.hashCode(this.Partido);
		hash = 47 * hash + (int) (this.Votos ^ (this.Votos >>> 32));
		return hash;
	}
}
