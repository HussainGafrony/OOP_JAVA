package Polymorphism;

public class Salary {
    public double salary, overTime, absent, absentRate, overTimeRate;

    public Salary(double salary, double overTime, double absent, double absentRate, double overTimeRate, double tax) {
        this.salary = salary;
        this.overTime = overTime;
        this.absent = absent;
        this.absentRate = absentRate;
        this.overTimeRate = overTimeRate;
        this.tax = tax;
    }

    public double tax;

    public double getSalary() {
        return salary;
    }

    public double calculateSalary() {
        return salary - (salary * tax);
    }

    public double calculateSalary(double extraTax) {
        return this.calculateSalary() - (salary * extraTax);
    }
}
