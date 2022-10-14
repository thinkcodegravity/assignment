package inheritance;

	/*Write a program for  below inheritance scenario
	Person > employee > tester
	Person > employee > developer
	Person
	Has name, age
	Does talk, walk ( just sysout in this method is fine)
	Tester
	Has name, age, salary, jobTitle
	Does talk, walk, work ( just sysout in this method is fine)
	Developer
	Has name, age, salary, jobTitle
	Does talk, walk, work ( just sysout in this method is fine)
	
	 * 
	 */
public class person {
	String name ="Chris";
	int age = 29;
	
	public person() {
		System.out.println("Person talks and walk");
	}
	
	

}
