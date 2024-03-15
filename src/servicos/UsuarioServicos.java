/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.*;
import modelo.*;

import java.sql.SQLException;
/**
 *
 * @author 181700271
 */
public class UsuarioServicos {
    public void cadastrarUsuario(UsuarioVO uVO)throws SQLException{
        UsuarioDAO uDAO = DAOFactory.getUsuarioDAO();
        uDAO.buscarUsuario(uVO);
    }
}
