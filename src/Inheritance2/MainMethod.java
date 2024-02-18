package Inheritance2;

public class MainMethod {
	
public static void main(String[] args) {
	System.out.println("This is class person");
	Person p=new Person();
	p.talk();
	p.walk();
	System.out.println("*************************************************");
	System.out.println("This is class Employee");
	Employee e=new Employee();
	e.talk();
	e.walk();
	System.out.println("*************************************************");
	System.out.println("This is class Tester");
	Tester test=new Tester();
	test.talk();
	test.walk();
	test.work();
	System.out.println("*************************************************");
	System.out.println("This is class Developer");
	Developer dev=new Developer();
	dev.talk();
	dev.walk();
	dev.work();
	System.out.println("*************************************************");
	
	
	
	

}

}
