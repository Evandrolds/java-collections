package exemplo_de_Map.exemplo_2;

/**
 *
 * @author Evandro
 */
public class Product {
    private final String name;
    private final Double value;
    private final Integer quantity;

    public Product(String name, Integer quantity, Double value) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product: " + "\nName:" + name + "\nQuantity: " + quantity + "\nPrice $" + String.format("%.2f", value) + "\n";
    }
    
    
}
