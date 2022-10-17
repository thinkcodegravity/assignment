package inheritance;

public class Tester extends Employee{
	String jobtitle;
	
	public Tester(String n, int a, double s, String jobT) {
		name = n;
		age = a;
		salary = s;
		jobtitle = jobT;
	}
	
	public static void main(String[] args) {
		Tester p1 = new Tester("Ram", 40, 3500.67, "Entry Tester");
		System.out.println(p1.name + "\n" +  p1.age + "\n" + p1.salary + "\n" + p1.jobtitle);

	}
	

}
