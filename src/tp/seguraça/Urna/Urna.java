/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.seguraça.Urna;

import Exceções.VotoInseridoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 * Singleton
 */
public class Urna {
    private static ArrayList<Cargo> cargos;
    private static BancoDeVotos banco;
	private static VVPAT vvpat;
	private static final Urna INSTANCE = new Urna();
	
	/* Canditados universais */
    private static Candidato NULO;
	private static Candidato BRANCO;
    
    private Urna(){
        cargos = new ArrayList<>();
        banco = BancoDeVotos.getInstance();
		vvpat = VVPAT.getINSTANCE();
		NULO = new Candidato("nulo", -2, "", "");
		BRANCO = new Candidato("branco", -1, "", "");
		BancoDeVotos.addCandidato(NULO);
		BancoDeVotos.addCandidato(BRANCO);
    }
	
	public static Urna getInstance(){
		return INSTANCE;
	}
	
	public static ArrayList<String> getCargos(){
		ArrayList<String> cargosInterface = new ArrayList<>();
		for(Cargo cargo: cargos){
			cargosInterface.add(cargo.getNome());
		}
		return cargosInterface;
	}
	
	public static void addCargos(Cargo novoCargo){
		 cargos.add(novoCargo);
	}
	
	public static long getQntCargos(){
		return cargos.size();
	}
	
	public static String nomeCargo(int index){
		return cargos.get(index).getNome();
	}
	
	public static String getCandidato(Long numero) throws CloneNotSupportedException{
		String retorno = "";
		for(Cargo cargo: cargos){
			Candidato candidato = cargo.getCandidato(numero);
			if (candidato == null){
				continue;
			}
			retorno = candidato.toString();
		}
		return retorno;
	}
	
	public static Candidato __candInterface(Long numero, int index){		
		Cargo cargo = cargos.get(index);
		if(cargo == null){
			System.exit(-3);
		}
		
		if(numero == -1){return BRANCO;}
		
		Candidato candidato = null;
		try {
			candidato = cargo.getCandidato(numero);
		} catch (CloneNotSupportedException ex) {
			System.out.println("Erro ao clonar objeto");
			Logger.getLogger(Urna.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		if (candidato == null){return NULO;}
		
		return candidato;
	}
	
	public static void addCandidato(Candidato novoCandidato, Cargo cargo){
		cargo.adicionaCandidato(novoCandidato);
	}
	
	public static void addVoto(int index, long numCandidato) throws VotoInseridoException {
		
		Candidato candidato = null;
		Cargo cargo = cargos.get(index);
		try {
			candidato = cargo.getCandidato(numCandidato);
		} catch (CloneNotSupportedException ex) {
			System.out.println(ex.getMessage());
		}

		/* Se não ouver candidatos o voto é nulo */
		if (candidato == null){
			candidato = NULO;
		}
		if (numCandidato == -1){
			candidato = BRANCO;
		}

		boolean votou = BancoDeVotos.addVoto(candidato);
		if(!votou){
			throw new VotoInseridoException("Não foi registrado o voto do eleitor");
		}
	}
	
	public static void printVoto(Long numCand, Cargo atual){
		Candidato c = NULO;
		try {
			c = atual.getCandidato(numCand);
		} catch (CloneNotSupportedException ex) {
			Logger.getLogger(Urna.class.getName()).log(Level.SEVERE, null, ex);
		}
		if(c == null){
			if(numCand == -1){
				c = BRANCO;
			}else{
				c = NULO;
			}
		}
		
		vvpat.printVoto(c);
	}
	
	public static String geraBoletim(){
		return BancoDeVotos.geraBoletim();
	}
	
	public static void finalizar(){
		BancoDeVotos.finalizar();
	}
}
