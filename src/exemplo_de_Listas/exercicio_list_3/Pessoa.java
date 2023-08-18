package exemplo_de_Listas.exercicio_list_3;

import java.time.LocalDate;

/**
 *
 * @author Evandro
 */
public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private Integer idade;
    private Double altura;
    private LocalDate dadaCadastro;

    public Pessoa(String nome, Integer idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.dadaCadastro = LocalDate.now();
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Double getAltura() {
        return altura;
    }

    public LocalDate getDadaCadastro() {
        return dadaCadastro;
    } 
     @Override
    public int compareTo(Pessoa p) {
        return p.getIdade().compareTo(this.getIdade());
    }

    @Override
    public String toString() {
        return "Pessoa " + "\nNome:" + nome + "\nIdade=" + idade + "\n Altura: " + altura + "\nDadaCadastro=" + dadaCadastro + "\n";
    }

}
