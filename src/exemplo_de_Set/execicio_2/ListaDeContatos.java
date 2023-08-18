package exemplo_de_Set.execicio_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author Evandro
 */
public class ListaDeContatos {

    private Set<Contato> contatos;

    public ListaDeContatos() {
        this.contatos = new HashSet<>();
    }

    public void addContato(String nome, String telefone) {
        contatos.add(new Contato(nome, telefone));
    }

    public Set<Contato> searchContato(String nome) {
        return contatos.stream().filter((contato) -> contato.getNome().startsWith(nome)).collect(Collectors.toSet());

    }

    public void exibirContatos() {
        contatos.stream().forEach(System.out::println);
    }

    public Contato updateContato(String nome, String telefone) {
        Contato c = null;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                c = contato;
                c.setTelefone(telefone);
                break;
            }
        }
      return c;

    }
}
