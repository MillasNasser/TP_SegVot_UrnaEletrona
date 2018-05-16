
package tp.segurança.BancoDeDadosMesário;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaTabelaSQLite {
    
    private final ConexaoSQLite conexaoSQLite;
    
    public CriaTabelaSQLite(ConexaoSQLite pConexaoSQLite){
        this.conexaoSQLite = pConexaoSQLite;
    }

    public void criaTabelaEleitores(){
        String sql = "CREATE TABLE IF NOT EXISTS tabelaEleitores"
                + "("
                + "id integer PRIMARY KEY AUTOINCREMENT,"
                + "nome text not NULL,"
                + "cpf text not NULL,"
                + "sec text not NULL,"
                + "titulo text not NULL"
                + ");";

        boolean conectou = false;
        
        try{
            conectou = this.conexaoSQLite.conectar();
            Statement stmt = this.conexaoSQLite.criarStatement();
            stmt.execute(sql);
        }catch (SQLException e){
            System.err.println(e.getMessage());
        } finally{
            if(conectou){
                this.conexaoSQLite.desconectar();
            }
        }
    }
    
    public void criaTabelaCandidatos(){
        String sql = "CREATE TABLE IF NOT EXISTS tabelaCandidatos"
                + "("
                + "id integer PRIMARY KEY AUTOINCREMENT,"
                + "nome text not NULL,"
                + "numero integer not NULL,"
                + "partido text not NULL,"
                + "titulo text not NULL"
                + ");";

        boolean conectou = false;
        
        try{
            conectou = this.conexaoSQLite.conectar();
            Statement stmt = this.conexaoSQLite.criarStatement();
            stmt.execute(sql);
        }catch (SQLException e){
            System.err.println(e.getMessage());
        } finally{
            if(conectou){
                this.conexaoSQLite.desconectar();
            }
        }
    }
    
}
