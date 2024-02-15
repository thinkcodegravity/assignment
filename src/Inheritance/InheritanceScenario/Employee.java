package Inheritance.InheritanceScenario;

public class Employee extends Person {
    String name;
    int age;
    double salary;

    @Override
    public void talk() {
        System.out.println("Talking from Employee");
    }

    @Override
    public void walk() {
        super.walk();
    }
}
