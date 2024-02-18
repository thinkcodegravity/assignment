package inheritance.employee;

public class Developer extends Employee{
	String jobTitle;
	public Developer(String name, byte age, double salary, String jobTitle) {
		super(name,age,salary);
		this.jobTitle =jobTitle;
	}
	public void devWork() {
		System.out.println("is developing");
	}
}
