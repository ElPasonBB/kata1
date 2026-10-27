package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2006, 10, 15);
        Person person = new Person("Airán", "Rivero", birthday);

        System.out.println("Nombre: " + person.name() + ", Apellido: " + person.surname() + ", Edad: " + person.age());
    }
}
