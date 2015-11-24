package hw.week3.circus.model;

import java.io.Serializable;


public class Stuff implements Serializable {

    private String name;
    private double salary;

    public Stuff() {
        this.name = "empty object";
        this.salary = 0.0;
    }

    public Stuff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
            return "Stuff{" +
                    "name='" + name  +
                    ", salary=" + salary +
                    '}';
        }
}

