/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.seguraça;

/**
 *
 * @author rafael
 */
public class Candidato extends Pessoa {

    private int Numero;
    private String Partido;

    public Candidato(String nome, int numero, String Partido) {
        super(nome);
        this.Numero = numero;
        this.Partido = Partido;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        this.Numero = numero;
    }

    public String getPartido() {
        return Partido;
    }

    public void setPartido(String partido) {
        Partido = partido;
    }
}
