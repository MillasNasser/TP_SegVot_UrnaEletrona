
package tp.seguraça.BancoDeDadosMesário;
import tp.seguraça.TerminalMesario.Eleitor;


public class FuncSQLite {
        
    public void inicializaBD(){
        //Abre conexão e cria tabela
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        CriaTabelaSQLite criaTabela = new CriaTabelaSQLite(conexaoSQLite);
        criaTabela.criaTabelaEleitores();
        criaTabela.criaTabelaCandidatos();
    }
    
    public void insereEleitor(){
        
        
    }
    
    public void insereCandidato(){
        
    }
    
}
