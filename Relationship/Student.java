package Relationship;

public class Student {
    private String name, homework;
    private int HomeWorkScore;

    public Student(String name) {
        this.name = name;

    }

    public String assignATempTeacher(Teacher teacher) {
        return homework = teacher.assignAHomeWork();
    }

    public int doHomeWork() {
        return this.HomeWorkScore = 90;
    }

    public int getHomeWorkScore() {
        this.doHomeWork();
        return this.HomeWorkScore;

    }
}
