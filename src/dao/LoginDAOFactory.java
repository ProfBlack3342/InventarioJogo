
package dao;

/**
 *
 * @author dudup
 */
public class LoginDAOFactory {
    
    private static LoginDAO loginDAO = new LoginDAO();

    public static LoginDAO getLoginDAO() {
        return loginDAO;
    }
}
