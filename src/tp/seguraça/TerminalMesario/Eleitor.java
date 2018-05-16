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
	
	public Eleitor(String nome, String titulo){
		super(nome);
		this.tituloEleitor = titulo;
	}

	public String getTituloEleitor() {
		return tituloEleitor;
	}
}
