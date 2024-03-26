package inheritance;

public class Developer extends Employee{
	String jobTitle = "Developer";
	public void work() {
		System.out.println(jobTitle);
	}
}