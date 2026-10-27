package software.ulpgc.kata1;

import java.util.Map;

public record Student(String name, String surname, Map<String, Double> subjects) {

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
