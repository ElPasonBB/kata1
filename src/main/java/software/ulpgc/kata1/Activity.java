package software.ulpgc.kata1;

import java.time.Duration;
import java.time.LocalDate;

public record Activity(String name, LocalDate dueDate) {

    public int remainingTime() {
        return (int) Duration.between(LocalDate.now().atStartOfDay(), this.dueDate.atStartOfDay()).toHours();
    }
}
