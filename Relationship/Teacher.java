package Relationship;

abstract class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String saywelcome(Printer printer) {
        printer.setStringToBePrinted(name);
        return printer.printToScreen();
    }

    abstract public String assignAHomeWork();

    public String evaluateStudentHomeWork(Student student) {
        if (student.getHomeWorkScore() > 50) {
            System.out.println(student.getHomeWorkScore());
            return "Success";
        }
        return "Failed";
    }

}
