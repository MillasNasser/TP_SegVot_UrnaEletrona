
public class Candidato {

    private String nome;
    private int Numero;
    private String Partido;
  

    public Candidato( String nome,int numero,String Partido)
    {
      this.nome = nome;       
      this.numero = numero;
      this.Partido = Partido;
    }

    /* Get and Set */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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



