
package tp.seguraça.BancoDeDadosMesário;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class ConexaoSQLite {
    private Connection conexao;
    
    public boolean conectar(){
        try{
            String url = "jdbc:sqlite:BancoDeDados/dbMesário.db";
            this.conexao = DriverManager.getConnection(url);
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean desconectar(){
        try{
            if(this.conexao.isClosed() == false){
                this.conexao.close();
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    public Statement criarStatement(){
        try{
            return this.conexao.createStatement();
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return null;
        }
    }
    
    public PreparedStatement criarPreparedStatement(String sql) {
        try {
            return this.conexao.prepareStatement(sql);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    
    public Connection getConexao(){
        return this.conexao;
    }
    
}
