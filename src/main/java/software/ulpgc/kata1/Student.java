package software.ulpgc.kata1;

import java.util.Map;

public class Student {
    private String name;
    private String surname;
    private Map<String, Double> subjects;

    public Student(String name, String surname, Map<String, Double> subjects) {
        this.name = name;
        this.surname = surname;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Map<String, Double> getSubjects() {
        return subjects;
    }

    public double termMean() {
        double mean = 0.;

        if (this.subjects.isEmpty()) {
            return 0.;
        }

        for (double grade : this.subjects.values()) {
            mean += grade;
        }

        return mean / this.subjects.size();
    }
}
