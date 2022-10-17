package inheritance;

public class Developer extends Employee{
	String jobtitle;
	
	public Developer(String n, int a, double s, String jobT) {
		name=n;
		age=a;
		salary=s;
		jobtitle=jobT;
		
	}
	
	public  static void  main (String[]args) {
		Developer d1= new Developer("Shyam", 35, 5000.75, "Senior Developer");
		System.out.println(d1.name + "\n" +  d1.age + "\n" + d1.salary + "\n" + d1.jobtitle);

		
		
	}
	

}
