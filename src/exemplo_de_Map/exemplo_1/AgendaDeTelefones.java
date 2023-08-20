package exemplo_de_Map.exemplo_1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Evandro
 */
public class AgendaDeTelefones {

    private Map<String, Integer> agenda;

    public AgendaDeTelefones() {
        this.agenda = new HashMap<>();
    }

    public void addAgenda(String name, int telefone) {
        agenda.put(name, telefone);
    }

    public void showAgenda() {
        agenda.forEach((x, y) -> {
            System.out.println(x + ":" + y);
        });
    }

    public void removeTelefoneByName(String name) {
        if (!agenda.isEmpty()) {
            agenda.remove(name);
        }
    }

    public Integer serchingByName(String name) {
        if (agenda.containsKey(name)) {
            return agenda.get(name);
        }
        return 0;
    }


}
