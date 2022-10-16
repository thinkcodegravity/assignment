package inheritance;

public class Developer extends Tester {

	public static void main(String[] args) {
		Tester T = new Tester();
		
		System.out.println("Developer name: " + T.name);
		System.out.println("Developer age; "+ T.age);
		System.out.println("Developer works");
		System.out.println("Title : " + T.jobTitle);
		System.out.println("Salary: " + T.salary);
	T.walk();
	T.talk();
	
	}
}