package com.inheritance;

public class Employee extends Person{
	
	double salary;

  
    void talk() {
        System.out.println(name + " is talking as an employee.");
    }

   
    void walk() {
        System.out.println(name + " is walking as an employee.");
    }

}
