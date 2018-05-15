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
public class Candidato {
    
    private int numero;
    private String Partido;    
    
}

    public Candidato(int numero,String Partido)
    {
      this.numero = numero;
      this.Partido = Partido;
    }

   public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPartido() {
        return Partido;
    }

    public void setPartido(String cPF) {
        Partido = partido;
    }
