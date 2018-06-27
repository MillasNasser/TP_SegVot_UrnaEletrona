/* 
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor. 
 */ 
package tp.seguraça; 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
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
			TerminalMesario.adicionarEleitor(new Eleitor(eleitor[0].trim(), eleitor[1].trim()));
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
				candidato[0] = candidato[0].trim().replaceFirst(".$","");
				
				/* Adicionando o cargo a urna */
				cargo = new Cargo(candidato[0]);
				Urna.addCargos(cargo);
			}else 
			/* É um candidato */
			if(candidato.length == 3 && cargo != null){
				if(candidato[1].trim().length() <= 5){
					cargo.setQntCampos(candidato[1].trim().length());
				}
				cargo.adicionaCandidato(
					new Candidato(
						candidato[0].trim(), 
						candidato[1].trim(), 
						candidato[2].trim(), 
						cargo.getNome()
					)
				);
			}
		}
	}
	
	static void verficaAssinatura(String[] args) throws IOException, Exception{
		/* Pega o arquivo de eleitores e candidatos e calcula o seu hash */
		String hashEleitor = Criptografia.generateHash(
			new String(
				Files.readAllBytes(Paths.get(args[0])),
				StandardCharsets.UTF_8
			)
		);
		
		String hashCandidato = Criptografia.generateHash(
			new String(
				Files.readAllBytes(Paths.get(args[1])),
				StandardCharsets.UTF_8
			)
		);
		
		/* Verifica a assinatura e pega o hash assinado */
		String arq_hashEleitor = new String(
			Criptografia.verifySingnature(
				Files.readAllBytes(Paths.get(args[0]+".hash"))
			),
			StandardCharsets.UTF_8
		);
		
		String arq_hashCandidato = new String(
			Criptografia.verifySingnature(
				Files.readAllBytes(Paths.get(args[1]+".hash"))
			),
			StandardCharsets.UTF_8
		);
		
		/* Se o hash na assinatura != hash do arquivo: ERRO */
		if(!hashEleitor.equals(arq_hashEleitor) || 
			!hashCandidato.equals(arq_hashCandidato)
		){ 
			System.out.println("Arquivos de eleitores e de candidatos não possuem assinatura digital válida");
			System.exit(-1);
		}
	}
	
    /** 
     * @param args the command line arguments 
	 * @throws java.lang.Exception 
     */ 
    public static void main(String[] args) throws Exception { 
		
		Criptografia crip = new Criptografia();
		Urna urna = Urna.getInstance();
		TerminalMesario terminal = TerminalMesario.getInstance();
		
		verficaAssinatura(args);
		
		addEleitor(args[0]);
		
		addCargos(args[1]);
		
		/* Interfaces */
		InterfaceUrna u = new InterfaceUrna();
		InterfaceMesário a = new InterfaceMesário();
		u.setMesarioAssociado(a);
		a.setUrnaAssociada(u);
		a.setVisible(true);
		u.setVisible(true);
    }
}

/*String hashEleitor = Criptografia.generateHash(
			new String(
				Files.readAllBytes(Paths.get(args[0])),
				StandardCharsets.UTF_8
			)
		);
		
		String hashCandidato = Criptografia.generateHash(
			new String(
				Files.readAllBytes(Paths.get(args[1])),
				StandardCharsets.UTF_8
			)
		);
		
		/*new FileOutputStream(args[0]+".hash").write(
				Criptografia.encrypt(hashEleitor));
		new FileOutputStream(args[1]+".hash").write(
				Criptografia.encrypt(hashCandidato));*/