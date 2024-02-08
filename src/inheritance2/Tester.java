package inheritance2;

public class Tester extends Employee{
	
	String jobTitle;

	public Tester(String name, int age, double salary, String jobTitle) {
		super(name, age, salary);
		this.jobTitle = jobTitle;
	}

	public void work() {
		System.out.println("Tester Working");
	}

	
	//Has name, age, salary, jobTitle
	//Does talk, walk, work ( just sysout in this method is fine)
	
	

}
