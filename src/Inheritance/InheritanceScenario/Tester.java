package Inheritance.InheritanceScenario;

public class Tester extends Employee {
    String name;
    int age;
    double salary;
    String jobTitle;

    @Override
    public void talk() {
        System.out.println("Talking from tester");
    }

    @Override
    public void walk() {
        System.out.println("Walking from tester");
    }

    public void work(){
        System.out.println("working tester!!");
    }
}
