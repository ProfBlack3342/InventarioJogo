
package servicos;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.DAOFactory;
import dao.PersonagemDAO;
import modelo.PersonagemVO;

/**
 *
 * @author dudup
 */
public class PersonagemServicos {
    
    public void cadastrarPersonagem(PersonagemVO personagem) throws SQLException{
        PersonagemDAO pDAO = DAOFactory.getPersonagemDAO();
        pDAO.cadastrarPersonagem(personagem);
    }
    
    public ArrayList<PersonagemVO> buscarPersonagem() throws SQLException{
        PersonagemDAO pDAO = DAOFactory.getPersonagemDAO();
        return pDAO.buscarPersonagem();
    }
    
    public ArrayList<PersonagemVO> filtrarPersonagem(String query) throws SQLException{
        PersonagemDAO pDAO = DAOFactory.getPersonagemDAO();
        return pDAO.filtrarPersonagem(query);
    }
    
    public void deletarPersonagem(int idPersonagem) throws SQLException {
        PersonagemDAO pDAO = DAOFactory.getPersonagemDAO();
        pDAO.deletarPersonagem(idPersonagem);
    }
}