package com.inheritance;

public class Developer extends Employee{
	
	String jobTitle;

    void talk() {
        System.out.println(name + " is talking as a developer.");
    }

  
    void walk() {
        System.out.println(name + " is walking as a developer.");
    }

    void work() {
        System.out.println(name + " is working as a developer.");
    }
    
    public static void main(String[] args) {
		Developer developer = new Developer();
		developer.name = "srijana";
		developer.talk();
		developer.walk();
		developer.work();
	}

}
