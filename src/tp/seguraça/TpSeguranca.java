/* 
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor. 
 */ 
package tp.seguraça; 

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
		BufferedReader scanner;
		scanner = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.print("Digite o titulo do eleitor: ");
			String titulo = scanner.readLine();
			if(TerminalMesario.verificarEleitor(titulo)){
				while(true){
					System.out.print("Digite o numero do candidato: ");
					long numCand = Long.parseLong(scanner.readLine());
					System.out.println(Urna.getCandidato(numCand));
					System.out.print("Confirma o voto?[S/N]: ");
					if(scanner.readLine().equals("S")){
						Urna.addVoto(presidente, numCand);
						TerminalMesario.votar(titulo);
						break;
					}else{
						System.out.println("Voto não confirmado");
					}
				}
			}else{
				break;
			}
		}
		Urna.finalizar();
    }
     
}