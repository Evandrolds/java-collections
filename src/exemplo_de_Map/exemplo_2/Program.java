package exemplo_de_Map.exemplo_2;

import java.util.Locale;

/**
 *
 * @author Evandro
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ProductStock prod = new ProductStock();
        prod.addProduct(1, "Cola PVC", 25, 12.4);
        prod.addProduct(2, "Tesoura", 12, 7.5);
        prod.addProduct(3, "Cano 3/4", 31, 17.6);
        prod.addProduct(4, "Cano 50mm", 21, 35.8);
        prod.addProduct(5, "Prumo", 27, 15.3);
        System.out.println("Show Products");
        prod.showProducts();
        System.out.println("Show product more sheap");
        prod.showProductMoreSheap();
        System.out.println("Show product more Expensive");
        prod.showProductMoreExpensive();
        System.out.println("Show total Product Stock");
        prod.calculateTotalStock();
        System.out.println("Show Product Greater Amount Total Stock");
        prod.showProductGreaterAmountTotalStock();
    }
}
