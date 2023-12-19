
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Usuario;
import persistencia.ConexaoBanco;

/**
 *
 * @author cralves
 */
public class LoginDAO {
    
    Connection con;
    
    public boolean autenticarLogin(Usuario usuario) throws SQLException {
        
        con = new ConexaoBanco().getConexao();
        boolean retorno = false;
        
        try
        {
            String sql = "SELECT * FROM usuario WHERE login=? AND senha=?";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, usuario.getLogin() );
            pstm.setString(2, usuario.getSenha() );
            
            ResultSet rs = pstm.executeQuery();
            retorno = rs.next();
            
            rs.close();
            pstm.close();
        }
        catch (SQLException se)
        {
            throw new SQLException("Erro durante a autenticação: " + se);
        }
        finally
        {
            con.close();
        }
        
        return retorno;
    }
}