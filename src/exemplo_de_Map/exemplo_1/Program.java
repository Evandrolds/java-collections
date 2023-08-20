package exemplo_de_Map.exemplo_1;

/**
 *
 * @author Evandro
 */
public class Program {
    public static void main(String[] args) {
        AgendaDeTelefones stock = new AgendaDeTelefones();
        stock.addAgenda("Charles", 922232345);
        stock.addAgenda("Samuel", 922235679);
        stock.addAgenda("Evandro", 934345987);
        stock.addAgenda("Maria", 934354556);
        stock.addAgenda("Joao", 924445557);
        System.out.println("Show Agenda");
       
        stock.showAgenda();
        System.out.println("Serch By Name");
        System.out.println(stock.serchingByName("Maria"));
       
    }
}
