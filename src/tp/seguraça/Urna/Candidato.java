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
    private final String Numero;
    private final String Partido;
	private String cargo;
	private long Votos;

    public Candidato(String nome, String numero, String Partido, String cargo) {
        super(nome);
        this.Numero = numero;
        this.Partido = Partido;
    }
	
	private Candidato(String nome, String numero, String Partido, String cargo, long Votos) {
        super(nome);
        this.Numero = numero;
        this.Partido = Partido;
		this.Votos = Votos;
    }

	public String getCargo() {
		return cargo;
	}

    public String getNumero() {
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
		candidato = getNome()+ ", numero: " + getNumero()+"\n";
		candidato += "Partido: "+Partido+"\n";
		return candidato;
	}	
	
	/**
	 *
	 * @return nova instancia de Candidato
	 * @throws CloneNotSupportedException
	 */
	@Override
	public Candidato clone() throws CloneNotSupportedException{
        return new Candidato(getNome(), getNumero(), getPartido(), getCargo(), getVoto());
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
		int hash = 7;
		hash = 71 * hash + Objects.hashCode(this.Numero);
		return hash;
	}
}
