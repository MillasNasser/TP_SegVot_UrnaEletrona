package tp.seguraça;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Pessoa {

    private String nome;
   
    public Pessoa( String nome)
    {
      this.nome = nome;       
    }

    /* Get and Set */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}