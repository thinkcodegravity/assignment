package Inheritance.InheritanceScenario;

public class Developer extends Employee {
    String name;
    int age;
    double salary;
    String jobTitle;

    @Override
    public void talk() {
        super.talk();
    }

    @Override
    public void walk() {
        super.walk();
    }

    public void work(){
        System.out.println("Working developer!!");
    }
}
