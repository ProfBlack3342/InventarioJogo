
package modelo;

/**
 *
 * @author dudup
 */
public class Personagem {
    
    private int idPersonagem, idUsuario, idImagem, idTipo;
    private String nome;

    public int getIdPersonagem() {
        return idPersonagem;
    }
    public void setIdPersonagem(int idPersonagem) {
        this.idPersonagem = idPersonagem;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdImagem() {
        return idImagem;
    }
    public void setIdImagem(int idImagem) {
        this.idImagem = idImagem;
    }

    public int getIdTipo() {
        return idTipo;
    }
    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}