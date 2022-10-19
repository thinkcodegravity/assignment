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

public class Person {

	protected String name;
	protected int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void talk() {
		System.out.println("A person is talking.");
	}

	public void walk() {
		System.out.println("A person is walking.");
	}
}
