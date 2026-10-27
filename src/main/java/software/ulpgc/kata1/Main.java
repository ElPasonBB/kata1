package software.ulpgc.kata1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> subjects = new HashMap<>();
        subjects.put("ASO", 7.6);
        subjects.put("IS2", 8.3);
        subjects.put("BD2", 10.0);
        subjects.put("RC", 6.2);
        subjects.put("FSI", 5.3);

        Student student = new Student("Airán", "Rivero", subjects);

        System.out.println("Nombre: " + student.getName() + ", Apellido: " + student.getSurname() + ", Media: " + student.termMean());
    }
}
