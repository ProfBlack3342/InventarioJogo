
package servicos;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.PersonagemDAOFactory;
import dao.PersonagemDAO;
import modelo.Personagem;

/**
 *
 * @author dudup
 */
public class PersonagemServicos {
    
    public void cadastrarPersonagem(Personagem personagem) throws SQLException {
        PersonagemDAO pDAO = PersonagemDAOFactory.getPersonagemDAO();
        pDAO.cadastrarPersonagem(personagem);
    }
    
    public ArrayList<Personagem> buscarPersonagem() throws SQLException{
        PersonagemDAO pDAO = PersonagemDAOFactory.getPersonagemDAO();
        return pDAO.buscarPersonagem();
    }
    
    public ArrayList<Personagem> filtrarPersonagem(String query) throws SQLException{
        PersonagemDAO pDAO = PersonagemDAOFactory.getPersonagemDAO();
        return pDAO.filtrarPersonagem(query);
    }
    
    public void deletarPersonagem(int idPersonagem) throws SQLException {
        PersonagemDAO pDAO = PersonagemDAOFactory.getPersonagemDAO();
        pDAO.deletarPersonagem(idPersonagem);
    }
}