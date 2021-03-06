/* 
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor. 
 */ 
package tp.seguraça; 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
 
	private static void addEleitor(String path) throws Exception{
		File eleitores = new File(path);
		
		BufferedReader reader = new BufferedReader(new FileReader(eleitores));
		
		String linha;
		while((linha = reader.readLine()) != null){
			String eleitor[] = linha.split(",");
			if(eleitor.length != 2){
				continue;
			}
			TerminalMesario.adicionarEleitor(new Eleitor(eleitor[0], eleitor[1]));
		}
	}
	
	private static void addCargos(String path) throws Exception{
		File candidatos = new File(path);
		BufferedReader reader = new BufferedReader(new FileReader(candidatos));
		
		String linha;
		linha = reader.readLine();
		Cargo cargo = null;
		while(linha != null){
			String candidato[] = linha.split(",");
			linha = reader.readLine();
			
			/* É um cargo */
			if(candidato.length == 1 && candidato[0].length() > 0){
				/* Removendo o ultimo simbolo*/
				candidato[0] = candidato[0].replaceFirst(".$","");
				
				/* Adicionando o cargo a urna */
				cargo = new Cargo(candidato[0]);
				Urna.addCargos(cargo);
			}else 
			/* É um candidato */
			if(candidato.length == 3 && cargo != null){
				cargo.adicionaCandidato(
					new Candidato(
						candidato[0], 
						Long.parseLong(candidato[1]), 
						candidato[2], 
						cargo.getNome()
					)
				);
			}
		}
	}
	
    /** 
     * @param args the command line arguments 
	 * @throws java.lang.Exception 
     */ 
    public static void main(String[] args) throws Exception { 
		
		Urna urna = Urna.getInstance();
		TerminalMesario terminal = TerminalMesario.getInstance();
		/*String[] cargos = {
					"DEPUTADO ESTADUAL",
					"DEPUTADO FERDERAL",
					"Panelinha",
					"GOVERNADOR",
					"PRESIDENTE"};
		System.out.println("Working Directory = " +
              System.getProperty("user.dir"));
		/* Adicionando os cargos e os candidatos de cada 1 */
		
		addEleitor(""
			+ "/mnt/"
			+ "981C548C1C546772/"
			+ "Dropbox/"
			+ "UFSJ/"
			+ "0_TP's/"
			+ "2018-1/"
			+ "SegurancaVotacaoEletronica/"
			+ "TP_SegVot_UrnaEletrona/"
			+ "eleitores.txt");
		
		addCargos(""
			+ "/mnt/"
			+ "981C548C1C546772/"
			+ "Dropbox/"
			+ "UFSJ/"
			+ "0_TP's/"
			+ "2018-1/"
			+ "SegurancaVotacaoEletronica/"
			+ "TP_SegVot_UrnaEletrona/"
			+ "candidatos.txt");
		
		/* Interfaces */
		InterfaceUrna u = new InterfaceUrna();
		InterfaceMesário a = new InterfaceMesário();
		u.setMesarioAssociado(a);
		a.setUrnaAssociada(u);
		a.setVisible(true);
		u.setVisible(true);
    }
}