package exemplo_de_Set.execicio_3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author Evandro
 */
public class CadastroDeProdutos implements Comparator<Product> {

    private Set<Product> products;

    public CadastroDeProdutos() {
        // Passando o TreeSet para melhor organização da lista de produtos
        this.products = new TreeSet<>();
    }

    public void addProduct(Integer code, String name, int quantity, double price) {
        products.add(new Product(code, name, quantity, price));
    }
    // exibindo os produtos

    public void showProducts() {
        products.stream().forEach(System.out::println);
    }

    // exibindo os produto por preco
    public Set<Product> showProductsByPrice(double price) {
        return products.stream().filter((x) -> x.getPrice().equals(price)).collect(Collectors.toSet());
    }

    // exibindo os produto por nome
    public Set<Product> showProductsByName(String name) {
        return products.stream().filter((x) -> x.getName().startsWith(name)).collect(Collectors.toSet());
    }

    // exibindo os produto por codigo
    public Set<Product> showProductsByCode(Integer code) {
        return products.stream().filter((x) -> x.getCode().equals(code)).collect(Collectors.toSet());
    }

    //Ordenando produtos por codico
    public Set<Product> sortingProductsByCode() {
        Set<Product> newproducts = new TreeSet<>(products);
        return newproducts;
    }

    // Calculando o valor total do estoque de produtos
    public Double getTotalValueProductStock() {
        double total = 0.0;
        for (Product p : products) {
            total += p.getPrice() * p.getQuantity();
        }
        return total;

    }

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }
}
