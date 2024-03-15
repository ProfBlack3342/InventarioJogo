
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.UsuarioVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author dudup
 */
public class UsuarioDAO {
    
    public boolean buscarUsuario(UsuarioVO usuario) throws SQLException {
        
        String sql = "SELECT * FROM usuario WHERE login=? AND senha=?";
        
        try(Connection con = new ConexaoBanco().getConexao(); PreparedStatement pstm = con.prepareStatement(sql))
        {
            pstm.setString(1, usuario.getLogin() );
            pstm.setString(2, usuario.getSenha() );
            
            try(ResultSet rs = pstm.executeQuery())
            {
                if(rs.next())
                {
                    usuario.setIdUsuario(rs.getInt(""));
                    usuario.setIdImagemUsuario(rs.getInt(""));
                    usuario.setIdTipoUsuario(rs.getInt(""));
                    usuario.setLogin(rs.getString(""));
                    usuario.setSenha(null);
                    usuario.setApelido(rs.getString(""));
                    
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        catch (SQLException se)
        {
            throw new SQLException("\nErro durante a autenticação em LoginDAO: " + se.getMessage());
        }
    }
}