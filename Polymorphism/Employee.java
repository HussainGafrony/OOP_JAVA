package Polymorphism;

public class Employee {
    private String name, address;
    private int age;
    private Salary salary;

    public Employee(String name, String address, int age, Salary salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public Salary getSalary() {
        return salary;
    }

}
