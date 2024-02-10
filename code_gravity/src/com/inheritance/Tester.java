package com.inheritance;

public class Tester extends Employee{
	
	String jobTitle;


    void talk() {
        System.out.println(name + " is talking as a tester.");
    }

    void walk() {
        System.out.println(name + " with " +jobTitle + " is walking as a tester.");
    }

    void work() {
        System.out.println(name + " of " +age +" is working as a tester" + " and has salary " +salary);
    }
    
    public static void main(String[] args) {
    	Tester tester = new Tester();
    	tester.name = "Shrawan";
    	tester.jobTitle = "Machine Learning Engineer";
    	tester.age = 22;
    	tester.salary = 50000;
    	tester.talk();
    	tester.walk();
    	tester.work();
	}
	
	

}
