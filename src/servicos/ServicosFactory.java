
package servicos;

/**
 *
 * @author dudup
 */
public class ServicosFactory {

    private static final PersonagemServicos personagemServicos = new PersonagemServicos();
    private static final UsuarioServicos usuarioServicos = new UsuarioServicos();
    
    public static PersonagemServicos getPersonagemServicos() {return personagemServicos;}
    public static UsuarioServicos getUsuarioServicos() {return usuarioServicos;}
}