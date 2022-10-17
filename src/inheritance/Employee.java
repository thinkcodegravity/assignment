package inheritance;
/*
 * employee
Has name, age, salary
Does talk, walk ( just sysout in this method is fine) 
 */

public class Employee extends Person {
	
	double salary;
	
	public void work() {
		System.out.println("Employee work really hard");
	}
	
	

}
