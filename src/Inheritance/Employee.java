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

public class Employee extends Person {

	protected double salary = 96000.0;

	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	@Override
	public void talk() {
		System.out.println("Employee is walking.");
	}

	@Override
	public void walk() {
		System.out.println("Employee is talking.");
	}

}
