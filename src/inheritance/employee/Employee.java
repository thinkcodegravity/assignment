package inheritance.employee;

public class Employee extends Person {
	double salary;
	public Employee(String name, byte age, double salary) {
		super(name,age);
		this.salary =salary;
	}
}
