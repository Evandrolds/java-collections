package exemplo_de_Map.exemplo_3;

import java.time.LocalDate;

/**
 *
 * @author Evandro
 */
public class Program {
    public static void main(String[] args) {
        ScheduleAtractions attraction = new ScheduleAtractions();
        attraction.addSchedule(LocalDate.of(2023, 8, 20) , "Who is caming", "The new now");
        attraction.addSchedule(LocalDate.of(2023, 7, 13) , "It's me", "Who I am?");
        attraction.addSchedule(LocalDate.of(2023, 9, 25) , "The Power", "Whose power is that?");
        attraction.addSchedule(LocalDate.of(2021, 11, 02) , "The return", "The Witch");
        System.out.println("Shoe Schedules ");
        attraction.showSchedule();
        System.out.println("=========================");
        System.out.println("Shoe next Attraction");
        attraction.getNextAttraction();
    }
    
}
