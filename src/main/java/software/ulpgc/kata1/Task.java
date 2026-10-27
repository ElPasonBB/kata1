package software.ulpgc.kata1;

import java.time.LocalDate;

public class Task {
    private String name;
    private LocalDate dueDate;

    public Task(String name, LocalDate dueDate) {
        this.name = name;
        this.dueDate = dueDate;
    }
}
