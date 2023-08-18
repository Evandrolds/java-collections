package exemplo_de_Set.execicio_3;

import java.util.Objects;

/**
 *
 * @author Evandro
 */
public class Product implements Comparable<Product> {

    private final Integer code;
    private final String name;
    private final Integer quantity;
    private final Double price;
    private Double totalValue;

    public Double getTotalValue() {
        return totalValue;
    }

    @Override
    public int compareTo(Product p) {
        return code.compareTo(p.getCode());
    }

    public Integer getCode() {
        return code;
    }

    public Product(Integer code, String name, Integer quantity, Double price) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Double getProdutosTotalValue() {
        return this.getPrice() * this.getQuantity();
    }

    //sobrescrevendo o metodo toString para exibir uma melhor formatação dos produtos
    @Override
    public String toString() {
        return "Produto:" + "\nCode:" + code + "\nName:" + name + "\nQuuantity:" + quantity + "\nPrice R$"
                + String.format("%.2f", price) + "\nTotal value products R$"
                + String.format("%.2f", getProdutosTotalValue()) + "\n";
    }

    // Sobrescreendo os metodos equals e hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
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
        final Product other = (Product) obj;
        return Objects.equals(this.name, other.name);
    }

}
