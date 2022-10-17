package Inheritance;

/* Write a program for calcualator
Method add that takes 2 int input and returns int
Method sub that takes 2 int input and returns int
Method mul that takes 2 int input and returns int
Method div that takes 2 int input and returns int

*/

public class Calculator {
	
	public int add (int x, int y) {
		int add = x + y;
		System.out.println("Result of addition: " + add);
		return add;
	}
	
	public int sub (int x, int y) {
		int sub = x - y;
		System.out.println("Result of subtraction: " + sub);
		return sub;
	}
	
	public int mul (int x, int y) {
		int mul = x * y;
		System.out.println("Result of multiplication: " + mul);
		return mul;
	}
	
	public int div (int x, int y) {
		int div = x / y;
		System.out.println("Result of division: " + div);
		return div;
	}
		
}
