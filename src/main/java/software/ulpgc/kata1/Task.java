package software.ulpgc.kata1;

import java.time.Duration;
import java.time.LocalDate;

public class Task {
    private String name;
    private LocalDate dueDate;

    public Task(String name, LocalDate dueDate) {
        this.name = name;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public int remainingTime() {
        return (int) Duration.between(LocalDate.now().atStartOfDay(), this.dueDate.atStartOfDay()).toHours();
    }
}
