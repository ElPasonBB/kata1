package software.ulpgc.kata1;

import java.time.LocalDate;
import java.time.Period;

public record Person(String name, String surname, LocalDate birthday) {

    public int age() {
        return Period.between(this.birthday, LocalDate.now()).getYears();
    }
}
