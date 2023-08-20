package exemplo_de_Map.exemplo_3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Evandro
 */
public class ScheduleAtractions {

    private Map<LocalDate, Attraction> scheduleAtractions;

    public ScheduleAtractions() {
        this.scheduleAtractions = new HashMap<>();
    }

    public void addSchedule(LocalDate date, String name, String attraction) {
        scheduleAtractions.put(date, new Attraction(name, attraction));
    }

    public void showSchedule() {
        Map<LocalDate, Attraction> newScheduleAttraction = new TreeMap<>(scheduleAtractions);
        newScheduleAttraction.values().stream().forEach(System.out::println);
    }

    public void getNextAttraction() {
        LocalDate nowDate = LocalDate.now();
        Map<LocalDate, Attraction> newScheduleAttraction = new TreeMap<>(scheduleAtractions);
        for (Map.Entry<LocalDate, Attraction> entry : newScheduleAttraction.entrySet()) {
            
            if (entry.getKey().isEqual(nowDate) || entry.getKey().isAfter(nowDate)) {
                System.out.println("Next Attraction " + entry.getValue() + " is at date: " + entry.getKey());
                break;
            }
        }
       
    }
}
