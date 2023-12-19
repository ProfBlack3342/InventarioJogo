
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jbcrypt.BCrypt;

import modelo.Usuario;
import persistencia.ConexaoBanco;

/**
 *
 * @author dudup
 */
public class LoginDAO {
    
    public boolean autenticarLogin(Usuario usuario) throws SQLException {
        
        boolean retorno = false;
        String sql = "SELECT * FROM usuario WHERE login=? AND senha=?";
        
        try(Connection con = new ConexaoBanco().getConexao(); PreparedStatement pstm = con.prepareStatement(sql))
        {
            pstm.setString(1, usuario.getLogin() );
            pstm.setString(2, usuario.getSenha() );
            
            try(ResultSet rs = pstm.executeQuery())
            {
                retorno = rs.next();
            }
        }
        catch (SQLException se)
        {
            throw new SQLException("\nErro durante a autenticação em LoginDAO: " + se.getMessage());
        }
        
        return retorno;
    }
}