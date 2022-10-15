package inheritance;

/*
 * Tester
Has name, age, salary, jobTitle
Does talk, walk, work ( just sysout in this method is fine
 */
public class Tester extends Employee {

	 String jobTitle = "Manager";

	public static void main(String[] args) {
		
		
		Employee E = new Employee();
		System.out.println("Nama: " +E.name);
		System.out.println("Age: " +E.age);
		System.out.println("Salary " +E.salary);
		System.out.println("Job Title: " + jobTitle);
		System.out.println("A Tester talks, walks, and works");

	}
}
