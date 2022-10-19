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

public class Tester extends Employee {

	protected String jobTitle;

	public Tester(String name, int age, double salary, String jobTitle) {
		super(name, age, salary);
		this.jobTitle = jobTitle;
	}

	@Override
	public void talk() {
		System.out.println("Tester is talking.");
	}

	@Override
	public void walk() {
		System.out.println("Tester is walking.");
	}

	public void work() {
		System.out.println("I am working as a Software Testing Engineer.");
	}

	public static void main(String[] args) {
		Tester tester = new Tester("Peter", 25, 70000.00, "Software Tester");
		System.out.println("Name: " + tester.name);
		System.out.println("Age: " + tester.age);
		System.out.println("Salary: " + tester.salary);
		System.out.println("Job Title: " + tester.jobTitle);

		tester.talk();
		tester.walk();
		tester.work();
	}

}
