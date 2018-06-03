/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.seguraça.TerminalMesario;

import java.util.ArrayList;

/**
 *
 * @author millas
 * Singleton
 */
public class TerminalMesario {
	private final static TerminalMesario INSTANCE = new TerminalMesario();
	private static ArrayList<Eleitor> eleitores;
	
	private TerminalMesario(){
		eleitores = new ArrayList<>();
	}
	
	public static TerminalMesario getInstance(){
		return INSTANCE;
	}
	
	public static boolean adicionarEleitor(Eleitor novoEleitor){
		boolean inserir = true;
		for(Eleitor eleitor: eleitores){
			if(eleitor.getTituloEleitor().equals(novoEleitor.getTituloEleitor())){
				inserir = false; break;
			}
		}
		if(inserir == true){
			eleitores.add(novoEleitor);
			return true;
		}
		return false;
	}
	
	public boolean verificarEleitor(String titulo){
		for(Eleitor eleitor: eleitores){
			if(eleitor.getTituloEleitor().equals(titulo)){
				return true;
			}
		}
		return false;
	}
}
