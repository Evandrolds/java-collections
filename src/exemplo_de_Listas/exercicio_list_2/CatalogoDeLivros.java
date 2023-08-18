package exemplo_de_Listas.exercicio_list_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author Evandro
 */
public class CatalogoDeLivros {
    private List<Livro> livros;
    
    
    public CatalogoDeLivros(){
        livros = new ArrayList<>();
    }
    public List<Livro>getLivros(){
        return this.livros;
    }
    public void adicionarLivros(List<Livro> livros){
        this.livros.addAll(livros);
    }
    public void pesquisarLivroPorAutor(String autor){
        if(livros.isEmpty()){
            System.out.println("Sua lista está vazia");
            return;
        }
        livros.stream()
                .filter((x)-> x.getAutor()
                        .equalsIgnoreCase(autor))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    public void listarCatalogo(){
        livros.forEach(System.out::println);
    }
    public void pesquisarLivrosEntreAno(int anoInicial, int anofinal){
        if(livros.isEmpty()){
            System.out.println("Não existe livros entre os anos digitado");
            return;
        }
        livros.stream().filter((x)-> x.getAno()>= anoInicial && x.getAno()<= anofinal).collect(Collectors.toList()).forEach(System.out::println);
        
    }
    public Livro pesquisarLivro(String title){
        Livro livro  = livros.stream().filter((x)-> x.getTile().equalsIgnoreCase(title)).findFirst().get();
        
        return livro;
    }
}
