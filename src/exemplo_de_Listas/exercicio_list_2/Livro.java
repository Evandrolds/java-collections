package exemplo_de_Listas.exercicio_list_2;


/**
 *
 * @author Evandro
 */
public class Livro implements Comparable<Livro>{
    private String title;
    private String autor;
    private Integer ano;
    
    public Livro(){
        
    }
    public Livro(String title, String autor, Integer ano){
        this.title = title;
        this.autor = autor;
        this.ano= ano;
    }
    @Override
    public int compareTo(Livro l){
        return ano.compareTo(l.ano);
    }
    
    public String getTile(){
        return this.title;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAno() {
        return ano;
    }

    

    @Override
    public String toString() {
        return "Livro{" + "\n Title: " + title + "\n Autor: " + autor + "\n Ano: " + ano + '}';
    }
    
    
}
