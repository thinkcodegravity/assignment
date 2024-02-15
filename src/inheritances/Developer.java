package inheritances;

public class Developer extends Employee{
	
	String jobTitle;
	
	public void talk() {
		super.talk();
	}
	
	public void walk() {
		super.walk();
	}
	
	public void work() {
		System.out.printf("Hi! I am %s I work as a %s.", super.name, jobTitle);
	}

}
