
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author cralves
 */
public class ConexaoBanco {

    public Connection getConexao() throws SQLException
    {
        Connection c = null;
        try
        {
            String url = "jdbc:mysql://localhost:3306/projetointegrador?useTimezone=true&serverTimezone=UTC&user=root&password=";
            c = DriverManager.getConnection(url);
        }
        catch (SQLException se)
        {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados: " + se.getMessage());
        }
        return c;
    }
    
}