package exemplo_de_Listas.exercicio_list_2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author Evandro
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ordenando uma lista de livros com comparable
        Livro  livro1 = new Livro("A cabana v-1 ", "Pull Alk-1", 2018);
        Livro  livro2 = new Livro("The Witch v-2", "Pull Alk-2", 2017);
        Livro  livro3 = new Livro("The Witch v-2", "Pull Alk-2", 2017);
        Livro  livro4 = new Livro("The Witch v-2", "Artur Alk-2", 2016);
        Livro  livro5 = new Livro("Banca v-3", "Jabaquara Alk-3", 2019);
        List<Livro> livros = new ArrayList<>(Arrays.asList(livro1, livro2,livro3,livro4,livro5));
        
//        Collections.sort(livros);
//        livros.forEach((x)-> {System.out.println(x);});

        CatalogoDeLivros catLivros = new CatalogoDeLivros();
         System.out.println("\nListar Catalogo de Livros");
         catLivros.adicionarLivros(livros);
         //catLivros.listarCatalogo();
        // System.out.println("\nPesquisar por Autor");
         
        // catLivros.pesquisarLivroPorAutor("Pull Alk-2");
         
//         System.out.println("Pesquisar livros por ano");
//         catLivros.pesquisarLivrosEntreAno(2016, 2017);
//         
         System.out.println("Pesquisar livros por title");
         
         System.out.println(catLivros.pesquisarLivro("The Witch v-2"));
    } 
    
}
