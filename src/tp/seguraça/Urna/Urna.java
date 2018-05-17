/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.seguraça.Urna;

import java.util.Vector;

/**
 *
 * @author rafael
 * Singleton
 */
public class Urna {
    private static Vector<Cargo> cargos;
    private static BancoDeVotos banco;
	private static VVPAT vvpat;
	private static final Urna INSTANCE = new Urna();
    
    private Urna(){
        cargos = new Vector<Cargo>();
        banco = BancoDeVotos.getInstance();
		vvpat = VVPAT.getINSTANCE();
    }
	
	public static Urna getInstance(){
		return INSTANCE;
	}
	
	public static boolean addCargos(Cargo novoCargo){
		boolean add = cargos.add(novoCargo);
		return add;
	}
}
