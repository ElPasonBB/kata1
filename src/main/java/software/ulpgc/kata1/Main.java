package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Activity activity = new Activity("X", LocalDate.of(2027, 10, 5));

        System.out.println("Tarea: " + activity.name() + ", Horas restantes: " + activity.remainingTime());
    }
}
