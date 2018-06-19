/* 
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor. 
 */ 
package tp.seguraça; 

import tp.seguraça.Interface.InterfaceMesário;
import tp.seguraça.Interface.InterfaceUrna;
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
		String[] cargos = {
					"DEPUTADO ESTADUAL",
					"DEPUTADO FERDERAL",
					"SENADOR",
					"GOVERNADOR",
					"PRESIDENTE"};
		
		/* Adicionando os cargos e os candidatos de cada 1 */
		int numCand = 0;
		for(String cargo: cargos){
			Cargo novoCargo = new Cargo(cargo);
			for(int i = 0; i < 5; i++){
				TerminalMesario.adicionarEleitor(new Eleitor("João "+i, "0"+i));
				novoCargo.adicionaCandidato(new Candidato("Jorgim "+cargo.substring(0, 4)+" "+i, numCand, "Part "+i));
				numCand++;
			}
			Urna.addCargos(novoCargo);
		}
		
		/* Interfaces */
		InterfaceUrna u = new InterfaceUrna();
		InterfaceMesário a = new InterfaceMesário();
		u.setMesarioAssociado(a);
		a.setUrnaAssociada(u);
		a.setVisible(true);
		u.setVisible(true);
		
		/* Adicionar Votos */
		/*BufferedReader scanner;
		scanner = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.print("Digite o titulo do eleitor: ");
			String titulo = scanner.readLine();
			if(TerminalMesario.verificarEleitor(titulo)){
				while(true){
					System.out.print("Digite o numero do candidato: ");
					long numCand = Long.parseLong(scanner.readLine());
					Urna.printVoto(numCand, presidente);
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
		Urna.finalizar();*/
    }
     
}