
package exemplo_de_Listas.exercicio_list_1;

/**
 *
 * @author Evandro
 */
public class Program {
    public static void main(String[] args) {
         ListaDeTarefas tarefa1 = new ListaDeTarefas();
         tarefa1.adicionarTarefa("Terceira");
         tarefa1.adicionarTarefa("Segunda");
         tarefa1.adicionarTarefa("Primeira");
         tarefa1.adicionarTarefa("Primeira");
         tarefa1.adicionarTarefa("Primeira");
         
        System.out.println("A quantidade de tarefas é "+ tarefa1.quantidadeDeTarefas());
       tarefa1.removerTarefa("Primeira");
        System.out.println("A quantidade de tarefas é "+ tarefa1.quantidadeDeTarefas());
        System.out.println("=======================");
        tarefa1.listarTarefas();
    }
}
