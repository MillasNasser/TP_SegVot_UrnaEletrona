/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.seguraça;

import java.util.Vector;

/**
 *
 * @author rafael
 */
public class Urna {
    private Vector<Cargo> cargos;
    private BancoDeVotos banco;
    
    public Urna(){
        cargos = new Vector<Cargo>();
        banco = new BancoDeVotos();
    }
}
