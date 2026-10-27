package software.ulpgc.kata1;

import java.util.HashMap;

public class Student {
    private String name;
    private String surname;
    private HashMap<String, Integer> subjects;

    public Student(String name, String surname, HashMap<String, Integer> subjects) {
        this.name = name;
        this.surname = surname;
        this.subjects = subjects;
    }
}
