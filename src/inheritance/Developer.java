package inheritance;

public class Developer extends Tester {
	
	public static void main(String [] args){

		Tester T= new Tester();
		
	System.out.println("person name: " +T.name);	
	System.out.println("Salary: " +T.salary);
	
	System.out.println("Title : " +T.jobTitle);
}
}