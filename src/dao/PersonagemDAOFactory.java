
package dao;

/**
 *
 * @author dudup
 */
public class PersonagemDAOFactory {
    
    private static PersonagemDAO personagemDAO = new PersonagemDAO();

    public static PersonagemDAO getPersonagemDAO(){
        return personagemDAO;
    }
}