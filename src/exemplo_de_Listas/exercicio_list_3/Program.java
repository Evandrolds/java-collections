package exemplo_de_Listas.exercicio_list_3;

/**
 *
 * @author Evandro
 */
public class Program {
    public static void main(String[] args) {
        
        OrdenarPessoa ordem = new OrdenarPessoa();
        
        ordem.addPessoa("Marcos", 25, 1.78);
        ordem.addPessoa("Mateus", 22, 1.70);
        ordem.addPessoa("Geremias", 35, 1.72);
        ordem.addPessoa("Paula", 29, 1.59);
        
        System.out.println("\n Ordenando por Idade:");
        ordem.ordenarPorIdade();
        
        System.out.println("\n Odenando por Altura:");
        ordem.ordenarPorAltura();
    }
}
