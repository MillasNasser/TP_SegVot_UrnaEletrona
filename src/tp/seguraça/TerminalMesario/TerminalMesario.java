/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.seguraça.TerminalMesario;

import java.util.HashMap;

/**
 *
 * @author millas
 * Singleton
 */
public class TerminalMesario {
	private final static TerminalMesario INSTANCE = new TerminalMesario();
	private static HashMap<String, Eleitor> eleitores;
	
	private TerminalMesario(){
		eleitores = new HashMap<>();
	}
	
	public static TerminalMesario getInstance(){
		return INSTANCE;
	}
	
	public static boolean adicionarEleitor(Eleitor novoEleitor){
		boolean inserir = true;
		if (eleitores.get(novoEleitor.getTituloEleitor()) == null){
			eleitores.put(novoEleitor.getTituloEleitor(), novoEleitor);
		}else{
			inserir = false;
		}
		return inserir;
	}
	
	public static boolean verificarEleitor(String titulo){
		Eleitor eleitor = eleitores.get(titulo);
		return eleitores.get(titulo) != null &&
				!eleitores.get(titulo).getJaVotou();
	}
	
	public static boolean votar(String titulo){
		if(verificarEleitor(titulo)){
			Eleitor eleitor = eleitores.get(titulo);
			eleitor.jaVotou(true);
			return true;
		}
		return false;
	}
}
