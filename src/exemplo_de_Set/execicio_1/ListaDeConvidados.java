package exemplo_de_Set.execicio_1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Evandro
 */
public class ListaDeConvidados {
    private Set<Convidado> convidados;

    public ListaDeConvidados() {
        this.convidados = new HashSet<>();
    }

    public Set<Convidado> getConvidados() {
        return convidados;
    }
    public void addConvidado(Convidado convidado){
        convidados.add(convidado);
    }
    public void removerConvidadoPorCodigo(int codigo){
        convidados.removeIf((x)-> x.getCodigoConvidado()==codigo);
        System.out.println("Removel o convidado de código " + codigo);
    }
    public void contarConvidados(){
        System.out.println("Quantidade de convidados: " + convidados.size());
    }
    public void exibirListaDeConvidados(){
        convidados.forEach(System.out::println);
    }
    
}
