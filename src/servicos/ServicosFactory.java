
package servicos;

/**
 *
 * @author cralves
 */
public class ServicosFactory {
    
    private static final PersonagemServicos personagemServicos = new PersonagemServicos();
    
    public static PersonagemServicos getPersonagemServicos(){
        return personagemServicos;
    }
}