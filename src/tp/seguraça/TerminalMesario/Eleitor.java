/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.seguraça.TerminalMesario;

import tp.seguraça.Pessoa;


/**
 *
 * @author millas
 */
public class Eleitor extends  Pessoa{	
	private final String tituloEleitor;
	private boolean jaVotou;
	
	public Eleitor(String nome, String titulo){
		super(nome);
		this.tituloEleitor = titulo;
		this.jaVotou = false;
	}

	public String getTituloEleitor() {
		return tituloEleitor;
	}
	
	protected void jaVotou(boolean valor){
		this.jaVotou = valor;
	}
	
	public boolean getJaVotou(){
		return this.jaVotou;
	}
}
