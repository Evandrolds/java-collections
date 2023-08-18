package exemplo_de_Set.execicio_1;

import java.util.Objects;

/**
 *
 * @author Evandro
 */
public class Convidado {
    private String nome;
    private Integer idade;
    private Integer codigoConvidado;

    public Convidado(String nome, Integer idade, Integer codigoConvidado) {
        this.nome = nome;
        this.idade = idade;
        this.codigoConvidado = codigoConvidado;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }
    public Integer getCodigoConvidado(){
        return codigoConvidado;
    }
    @Override
    public String toString() {
        return "   Convidado: " + "\nNome:" + nome + "\n Idade=" + idade + "\nCodigo do convite: "+ codigoConvidado+"\n";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.codigoConvidado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Convidado other = (Convidado) obj;
        return Objects.equals(this.codigoConvidado, other.codigoConvidado);
    }
    
}
