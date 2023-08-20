package exemplo_de_Map.exemplo_2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Evandro
 */
public class ProductStock {

    private Map<Long, Product> products;

    public ProductStock() {
        this.products = new HashMap<>();
    }

    public void addProduct(long code, String name, int quanity, double value) {
        products.put(code, new Product(name, quanity, value));
    }

    public void showProducts() {
        products.values().forEach(System.out::println);
    }
     public void calculateTotalStock() {
        Double total = 0.0;
        if (!products.isEmpty()) {
            for (Product obj : products.values()) {
                total += obj.getQuantity() * obj.getValue();
            }
            
        }
       System.out.println("Total Value $" + String.format("%.2f", total));
    }
    public void showProductMoreSheap() {
        Double price = Double.MAX_VALUE;
        String name = null;
        for (Map.Entry<Long, Product> entry : products.entrySet()) {
            Product p = entry.getValue();
            if (p.getValue() < price) {
                name = entry.getValue().getName();
                price = p.getValue();
            }

        }
        System.out.println(name + ": Price $" + String.format("%.2f", price));

    }
    public void showProductMoreExpensive() {
        Product prod = null;
        Double price = Double.MIN_VALUE;
        for (Map.Entry<Long, Product> entry : products.entrySet()) {
            Product p = entry.getValue();
            if (p.getValue() > price) {
               
                prod = p;
            }

        }
        System.out.println(prod);

    }
    public void showProductGreaterAmountTotalStock(){
        Product prod = null;
        Double minValue = Double.MAX_VALUE;
        double total = 0.0;
        if(!products.isEmpty()){
            for (Map.Entry<Long, Product> entry : products.entrySet()) {
                Product p = entry.getValue();
                if(p.getValue()< minValue){
                     prod = p;
                    total += p.getQuantity()*p.getValue();
                   
                }
            }
            
        System.out.println(prod +" Total $"+
                String.format("%.2f",total));
        }
    }

}
