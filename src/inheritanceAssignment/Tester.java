package inheritanceAssignment;

public class Tester extends Employee {
	
	String jobTitle;
	
	public Tester(String name, int age, double salary, String jobTitle) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}
	
	public static void main(String[] args) {
		Tester t1 = new Tester("Mike", 29, 3000.59, "Manual Tester");
		System.out.println(t1.name + "\n" +  t1.age + "\n" + t1.salary + "\n" + t1.jobTitle);

	}
	

	
	
	

}
