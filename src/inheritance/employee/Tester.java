package inheritance.employee;

public class Tester extends Employee{
	String jobTitle;
	public Tester(String name, byte age, double salary, String jobTitle) {
		super(name, age, salary);
		this.jobTitle =jobTitle;
	}
	public void work() {
		System.out.println("Does testing");
	}
}
