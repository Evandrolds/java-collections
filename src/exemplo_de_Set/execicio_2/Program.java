package exemplo_de_Set.execicio_2;
import java.util.Arrays;

/**
 *
 * @author Evandro
 */
public class Program {
    public static void main(String[] args) {
        ListaDeContatos contatos = new ListaDeContatos();
        
        contatos.addContato("Marcos", "97988-5454");
        contatos.addContato("Sergio", "95478-6474");
        contatos.addContato("Sergio lima", "95478-6969");
        contatos.addContato("Mateus", "93652-3287");
        contatos.addContato("Rosilene", "93336-9865");
        
        System.out.println("Exibindo contatos");
        contatos.exibirContatos();
        System.out.println("\nNova lista");
        contatos.exibirContatos();
        System.out.println("Procurar contato por nome");
        System.out.println(contatos.searchContato("Sergio"));
        System.out.println("Atualizar o telefone de um contato por nome");
        System.out.println(contatos.updateContato("Mateus","11 99575-4736"));
        
    }
}
