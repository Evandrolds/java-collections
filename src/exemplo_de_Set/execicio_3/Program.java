package exemplo_de_Set.execicio_3;

/**
 *
 * @author Evandro
 */
public class Program {

    public static void main(String[] args) {
        CadastroDeProdutos products = new CadastroDeProdutos();

        products.addProduct(1, "Cano 3/4", 23, 16.8);
        products.addProduct(1, "Cano 3/4", 23, 16.9);
        products.addProduct(2, "Ferro 3/8", 58, 27.9);
        products.addProduct(3, "Chave tipo fenda ", 87, 12.5);
        products.addProduct(1, "Cano 50mm", 23, 16.8);

        System.out.println("Show Products");
        products.showProducts();
        System.out.println("=====================");
        System.out.println("Show Product by name ");
        System.out.println(products.showProductsByName("Cano"));
        System.out.println("=====================");
        System.out.println("Show Product by price ");
        System.out.println(products.showProductsByPrice(16.8));
        System.out.println("=====================");
        System.out.println("Show Sorting Product by code ");
        System.out.println(products.sortingProductsByCode());
        System.out.println("=====================");
        System.out.println("Show Total product Stock");
        System.out.println("Total Stock R$ " + String.format("%.2f", products.getTotalValueProductStock()));
    }

}
