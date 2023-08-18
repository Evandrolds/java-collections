
package exemplo_de_Listas.exercicio_list_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Evandro
 */
public class ListaDeTarefas {
  
    private List<Tarefas> listaTarefas;

    public ListaDeTarefas() {
        this.listaTarefas = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        this.listaTarefas.add(new Tarefas(descricao));
    }
    public void removerTarefa(String descricao){
        listaTarefas.removeIf((x)-> x.getDescricao().equalsIgnoreCase(descricao));
    }
    public void listarTarefas(){
        listaTarefas.forEach((x)-> {System.out.println(x);});
    }
    public int quantidadeDeTarefas(){
        return listaTarefas.size();
    }

}
