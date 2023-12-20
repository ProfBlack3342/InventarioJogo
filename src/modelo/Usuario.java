
package modelo;

/**
 *
 * @author dudup
 */
public class Usuario {
    
    private int idUsuario, idImagemUsuario, idTipoUsuario;
    private String login, senha, apelido;
    

    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdImagemUsuario() {
        return idImagemUsuario;
    }
    public void setIdImagemUsuario(int idImagemUsuario) {
        this.idImagemUsuario = idImagemUsuario;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }
    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}