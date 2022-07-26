package pl.kurs.zadanie5;

public class Person implements Student, Employee{
    private String name;
    private String lastName;
    private long pesel;
    private double salary;
    private double schoolarship;

    public Person(String name, String lastName, long pesel) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    @Override
    public double getSalary() {
        return 0;
    }

    @Override
    public double getSchoolarship() {
        return schoolarship;
    }
    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }

    public double setSchoolarship(double schoolarship) {
        this.schoolarship = schoolarship;
        return schoolarship;
    }
}
