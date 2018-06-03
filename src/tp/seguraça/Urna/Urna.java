/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.seguraça.Urna;

import Exceções.VotoInseridoException;
import java.util.ArrayList;

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
		NULO = new Candidato("nulo", -2, "");
		BRANCO = new Candidato("branco", -1, "");
		BancoDeVotos.addCandidato(NULO);
		BancoDeVotos.addCandidato(BRANCO);
    }
	
	public static Urna getInstance(){
		return INSTANCE;
	}
	
	public static boolean addCargos(Cargo novoCargo){
		boolean add = cargos.add(novoCargo);
		return add;
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
	
	public static void addCandidato(Candidato novoCandidato, Cargo cargo){
		cargo.adicionaCandidato(novoCandidato);
	}
	
	public static void addVoto(Cargo cargo, long numCandidato) throws VotoInseridoException {
		for(Cargo nCargo: cargos){
			if(nCargo.equals(cargo)){
				Candidato candidato = null;
				try {
					candidato = nCargo.getCandidato(numCandidato);
				} catch (CloneNotSupportedException ex) {
					System.out.println(ex.getMessage());
				}
				
				/* Se não ouver candidatos o voto é nulo */
				if (candidato == null){
					candidato = NULO;
				}
				System.out.print("Registrando o seu voto cuzao\n");
				boolean votou = BancoDeVotos.addVoto(candidato);
				if(!votou){
					throw new VotoInseridoException("Não foi registrado o voto do eleitor");
				}
				return;
			}
		}
	}
	
	public static String geraBoletim(){
		return BancoDeVotos.geraBoletim();
	}
	
	public static void finalizar(){
		BancoDeVotos.finalizar();
	}
}
