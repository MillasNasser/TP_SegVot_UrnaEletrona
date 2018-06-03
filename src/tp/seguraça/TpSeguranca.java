/* 
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor. 
 */ 
package tp.seguraça; 

import java.util.Scanner;
import tp.seguraça.TerminalMesario.Eleitor;
import tp.seguraça.TerminalMesario.TerminalMesario;
import tp.seguraça.Urna.Candidato;
import tp.seguraça.Urna.Cargo;
import tp.seguraça.Urna.Urna;

/** 
 * 
 * @author rafael 
 */ 
public class TpSeguranca { 
 
    /** 
     * @param args the command line arguments 
	 * @throws java.lang.Exception 
     */ 
    public static void main(String[] args) throws Exception { 
		Urna urna = Urna.getInstance();
		TerminalMesario terminal = TerminalMesario.getInstance();
		Cargo presidente = new Cargo("Presidente");
		boolean addCargos;
		addCargos = Urna.addCargos(presidente);
		if (addCargos == false){
			throw new Exception("Cargo não adicionado");
		}
		for(int i = 0; i < 10; i++){
			TerminalMesario.adicionarEleitor(new Eleitor("Eleitor "+i, "0"+i));
			presidente.adicionaCandidato(new Candidato("Candidato "+i, i, "Partido "+i));
		}
		
		/* Adicionar Votos */
		Scanner scanner;
		scanner = new Scanner(System.in);
		while(true){
			long numCandidato;
			numCandidato = scanner.nextLong();
			if(numCandidato == -2){break;}
			System.out.println("Candidato numero: "+numCandidato);
			System.out.println(urna.getCandidato(numCandidato));
			boolean voto = false;
			voto = scanner.next().equals("S");
			if(voto){
				Urna.addVoto(presidente, numCandidato);
			}
		}
		Urna.finalizar();
    }
     
}