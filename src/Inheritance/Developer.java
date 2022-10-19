package Inheritance;

/*
	Write a program for  below inheritance scenario
	Person > employee > tester
	Person > employee > developer
	1. Person
		Has name, age
		Does talk, walk ( just sysout in this method is fine)
	2. Employee
		Has name, age, salary
		Does talk, walk ( just sysout in this method is fine) 
	3. Tester
		Has name, age, salary, jobTitle
		Does talk, walk, work ( just sysout in this method is fine)
	4. Developer
		Has name, age, salary, jobTitle
		Does talk, walk, work ( just sysout in this method is fine)
*/

public class Developer extends Employee {

	protected String jobTitle;

	public Developer(String name, int age, double salary, String jobTitle) {
		super(name, age, salary);
		this.jobTitle = jobTitle;
	}

	@Override
	public void talk() {
		System.out.println("Developer is talking.");
	}

	@Override
	public void walk() {
		System.out.println("Developer is walking.");
	}

	public void work() {
		System.out.println("I am working as a Java Developer.");
	}

	public static void main(String[] args) {
		Developer developer = new Developer("Prabin Kunwar", 27, 95000.0, "Java Developer");
		System.out.println("Name: " + developer.name);
		System.out.println("Age: " + developer.age);
		System.out.println("Salary: " + developer.salary);
		System.out.println("Job Title: " + developer.jobTitle);

		developer.talk();
		developer.walk();
		developer.work();
	}

}
