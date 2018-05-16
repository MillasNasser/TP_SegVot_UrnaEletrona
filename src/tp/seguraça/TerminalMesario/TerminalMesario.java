/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.seguraça.TerminalMesario;

import java.util.Vector;

/**
 *
 * @author millas
 */
public class TerminalMesario {
	public Vector<Eleitor> eleitores;
	
	public TerminalMesario(){
		eleitores = new Vector<Eleitor>();
	}
	
	public void adicionarEleitor(Eleitor novoEleitor){
		eleitores.add(novoEleitor);
	}
	
	public void verificarEleitor(Eleitor novoEleitor){
		eleitores.add(novoEleitor);
	}
}
