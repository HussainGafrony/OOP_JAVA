package Relationship;

/**
 * ScienceTeacher
 */
public class ScienceTeacher extends Teacher {

    public ScienceTeacher(String name) {
        super(name);
    }

    @Override
    public String assignAHomeWork() {
        return "prepare a sesearch";
    }

}