package inheritance2;

public class Person {
	
	protected String name;
	protected int age;
	
	public Person(String name2, int age2) {
		this.name = name2;
		this.age = age2;
	}
	public void talk() { 
		System.out.println("talking");
		}
	public void walk() { System.out.println("walking");}
}

