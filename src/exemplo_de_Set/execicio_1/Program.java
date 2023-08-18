package exemplo_de_Set.execicio_1;

import java.util.Arrays;

/**
 *
 * @author Evandro
 */
public class Program {
    public static void main(String[] args) {
        Convidado convite1 = new Convidado("Artur",24,1);
        Convidado convite2 = new Convidado("Jorge",18,2);
        Convidado convite3 = new Convidado("Marcos",20,2);
        Convidado convite4 = new Convidado("Mateus",22,4);
        ListaDeConvidados convidados = new ListaDeConvidados();
        
        convidados.addConvidado(convite1);
        convidados.addConvidado(convite2);
        convidados.addConvidado(convite3);
        convidados.addConvidado(convite4);
        
        System.out.println("Contar convidados");
        convidados.contarConvidados();
        
        System.out.println("Exibir lista de convidados");
        convidados.exibirListaDeConvidados();
        
        System.out.println("Remover um convidado por codigo");
        convidados.removerConvidadoPorCodigo(4);
        
          System.out.println("Exibir lista de convidados\n");
          convidados.exibirListaDeConvidados();
    }
}
