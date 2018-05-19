/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.seguraça.Urna;

/**
 * @author millas
 * Singleton
 */
public class VVPAT {
	private final static VVPAT INSTANCE = new VVPAT();
	
	private VVPAT(){
		
	}

	public static VVPAT getINSTANCE() {
		return INSTANCE;
	}
	
	public void printVoto(Candidato candidato){
		System.out.println(candidato.toString());
	}
}