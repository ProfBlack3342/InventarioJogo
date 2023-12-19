
package dao;

/**
 *
 * @author cralves
 */
public class PersonagemDAOFactory {
    
    private static final PersonagemDAO personagemDAO = new PersonagemDAO();

    public static PersonagemDAO getPersonagemDAO(){
        return personagemDAO;
    }
}
