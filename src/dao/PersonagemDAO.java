
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
 * @author dudup
 */
public class PersonagemDAO {
    
    public void cadastrarPersonagem(Personagem personagem) throws SQLException {
        
        String sql = "INSERT INTO personagem VALUES (null, ?, ?, ?, ? )";
        
        try(Connection con = new ConexaoBanco().getConexao(); PreparedStatement pstm = con.prepareStatement(sql))
        {
            pstm.setInt(1, personagem.getIdUsuario());
            pstm.setInt(2, personagem.getIdImagem());
            pstm.setInt(3, personagem.getIdTipo());
            pstm.setString(4, personagem.getNome());

            pstm.execute();
        }
        catch (SQLException se)
        {
            throw new SQLException("Erro no cadastro de personagem!");
        }
    }
    
    public ArrayList<Personagem> buscarPersonagem() throws SQLException {
        
        ArrayList<Personagem> pro = new ArrayList<>();
        String sql = "SELECT * FROM personagem";
        
        try(Connection con = new ConexaoBanco().getConexao(); PreparedStatement pstm = con.prepareStatement(sql); ResultSet rs = pstm.executeQuery())
        {
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
        return pro;
        }
        catch(SQLException se)
        {
            throw new SQLException("Erro ao buscar personagens! " + se.getMessage() );
        }
    }
    
    public ArrayList<Personagem> filtrarPersonagem(String query) throws SQLException {
        
        ArrayList<Personagem> pro = new ArrayList<>();
        String sql = "SELECT * FROM personagem " + query;
        
        try( Connection con = new ConexaoBanco().getConexao(); PreparedStatement pstm = con.prepareStatement(sql); ResultSet rs = pstm.executeQuery() )
        {
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
            return pro;
        }
        catch(SQLException se)
        {
            throw new SQLException("Erro ao filtrar personagens! " + se.getMessage() );
        }
    }
        
    public void deletarPersonagem(int idPersonagem) throws SQLException{
        
        String sql = "DELETE FROM personagem WHERE idPersonagem = ?";
        
        try(Connection con = new ConexaoBanco().getConexao(); PreparedStatement pstm = con.prepareStatement(sql))
        {
            pstm.setInt(1, idPersonagem);
            pstm.execute();
        }
        catch(SQLException se)
        {
            throw new SQLException("Erro ao deletar o personagem: " + se.getMessage());
        }
    }
}