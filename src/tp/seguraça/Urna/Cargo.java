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
 */
public class Cargo {
    private Vector<Candidato> listaCandidato;
    private String nome;
    
    public Cargo(String nome){
        this.nome = nome;
        listaCandidato = new Vector<>();
    }

    public Vector<Candidato> getListaCandidato() {
        return listaCandidato;
    }

    public String getNome() {
        return nome;
    }
    
    public void adicionaCandidato(Candidato novoCandidato){
        this.listaCandidato.add(novoCandidato);
    }
    
    public void removeCandidato(Candidato novoCandidato){
        this.listaCandidato.remove(novoCandidato);
    }
}
