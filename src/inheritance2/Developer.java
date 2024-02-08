package inheritance2;

public class Developer extends Employee {
	
	
	String jobTitle;

	public Developer(String name, int age, double salary, String jobTitle) {
		super(name, age, salary);
		this.jobTitle = jobTitle;
	}
	
	public void work() {
		System.out.println("Working");
	}

}
