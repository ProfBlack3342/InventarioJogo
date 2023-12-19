
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Personagem;
import persistencia.ConexaoBanco;

/**
 *
 * @author cralves
 */
public class PersonagemDAO {
    
    public void cadastrarPersonagem(Personagem personagem) throws SQLException {
        
        Connection con = new ConexaoBanco().getConexao();
        
        try
        {
            String sql = "INSERT INTO personagem VALUES (null, ?, ?, ?, ? )";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, personagem.getIdUsuario());
            pstm.setInt(2, personagem.getIdImagem());
            pstm.setInt(3, personagem.getIdTipo());
            pstm.setString(4, personagem.getNome());
            
            pstm.execute();
            pstm.close();
        }
        catch (SQLException se)
        {
            throw new SQLException("Erro no cadastro de personagem!");
        }
        finally
        {
            con.close();
        }
    }
    
    
    public ArrayList<Personagem> buscarPersonagem() throws SQLException {
        
        Connection con = new ConexaoBanco().getConexao();
        
        try
        {
            String sql = "SELECT * FROM personagem";
            PreparedStatement pstm = con.prepareStatement(sql);
              
            ResultSet rs = pstm.executeQuery();
            ArrayList<Personagem> pro = new ArrayList<>();
            
            while( rs.next())
            {
                Personagem pVO = new Personagem();
                
                pVO.setIdPersonagem(rs.getInt("idPersonagem"));
                pVO.setIdUsuario(rs.getInt("idUsuario"));
                pVO.setIdImagem(rs.getInt("idImagemPersonagem"));
                pVO.setIdTipo(rs.getInt("idTipoPersonagem"));
                pVO.setNome(rs.getString("nome"));
                                
                pro.add(pVO);
            }
            
            pstm.close();
            return pro;
        }
        catch(SQLException se)
        {
            throw new SQLException("Erro ao buscar personagens! " + se.getMessage() );
        }
        finally
        {
            con.close();
        }
    }
    
    public ArrayList<Personagem> filtrarPersonagem(String query) throws SQLException {
        
        Connection con = new ConexaoBanco().getConexao();
        
        try
        {
            String sql = "SELECT * FROM personagem " + query;
            PreparedStatement pstm = con.prepareStatement(sql);
              
            ResultSet rs = pstm.executeQuery();
            ArrayList<Personagem> pro = new ArrayList<>();
            
            while( rs.next())
            {
                Personagem pVO = new Personagem();
                
                pVO.setIdPersonagem(rs.getInt("idPersonagem"));
                pVO.setIdUsuario(rs.getInt("idUsuario"));
                pVO.setIdImagem(rs.getInt("idImagemPersonagem"));
                pVO.setIdTipo(rs.getInt("idTipoPersonagem"));
                pVO.setNome(rs.getString("nome"));
                                
                pro.add(pVO);
            }
            
            pstm.close();
            return pro;
            
        }
        catch(SQLException se)
        {
            throw new SQLException("Erro ao filtrar personagens! " + se.getMessage() );
        }
        finally
        {
            con.close();
        }
    }
        
    public void deletarPersonagem(int idPersonagem) throws SQLException {
        
        Connection con = new ConexaoBanco().getConexao();
        try
        {
            String sql = "DELETE FROM personagem WHERE idPersonagem = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, idPersonagem);
            
            pstm.execute();
            pstm.close();
        }
        catch(SQLException se)
        {
            throw new SQLException("Erro ao deletar o personagem: " + se.getMessage());
        }
        finally
        {
            con.close();
        }
    }

}
