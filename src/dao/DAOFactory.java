/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author 181700271
 */
public class DAOFactory {
    
    private static final PersonagemDAO personagemDAO = new PersonagemDAO();
    private static final UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    
    public static PersonagemDAO getPersonagemDAO() {return personagemDAO;}
    public static UsuarioDAO getUsuarioDAO() {return usuarioDAO;}
}
