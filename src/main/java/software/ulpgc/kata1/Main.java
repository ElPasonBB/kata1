package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Task task = new Task("X", LocalDate.of(2027, 10, 5));

        System.out.println("Tarea: " + task.name() + ", Horas restantes: " + task.remainingTime());
    }
}
