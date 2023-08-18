package exemplo_de_Listas.exercicio_list_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Evandro
 */
public class OrdenarPessoa {
    private List<Pessoa> pessoas;

    public OrdenarPessoa() {
        this.pessoas = new ArrayList<>();
    }
    
    public List<Pessoa>getPessoas(){
        return pessoas;
    }
    
    public void addPessoa(String nome, int idade,double altura){
       pessoas.add(new Pessoa(nome, idade, altura));
    }
    public void ordenarPorIdade(){
      Collections.sort(this.pessoas);
      pessoas.stream().forEach(System.out::println);
    }
    public void ordenarPorAltura(){
        Collections.sort(pessoas, new ComparatorPorAltura());
        pessoas.stream().forEach(System.out::println);
    }

   
}
