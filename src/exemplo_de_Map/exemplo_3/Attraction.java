package exemplo_de_Map.exemplo_3;

/**
 *
 * @author Evandro
 */
public class Attraction {
   private String name;
   private String attraction;

    public String getName() {
        return name;
    }

    public String getAttraction() {
        return attraction;
    }

    public Attraction(String name, String attraction) {
        this.name = name;
        this.attraction = attraction;
    }

    @Override
    public String toString() {
        return "Evento " + "\nName: " + name + "\nAttraction: " + attraction + "\n";
    }
   
   
}
