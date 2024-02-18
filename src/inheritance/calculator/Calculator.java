package inheritance.calculator;

//Write a program for calcualator
//Method add that takes 2 int input and returns int
//Method sub that takes 2 int input and returns int
//Method mul that takes 2 int input and returns int
//Method div that takes 2 int input and returns int

public class Calculator {
	
	public int sum(int a,int b) {
		int total;
		total = a+b;
		return total;
	}
	public int sub(int a,int b) {
		int minus;
		minus = a-b;
		return minus;
	}
	public int mul(int a,int b) {
		int multiply;
	    multiply = a*b;
		return multiply;
	}
	public int div(int a,int b) {
		int divide;
		if(b!=0) {
			divide =a/b;
			return divide;
		}else {
			System.out.println("value of b cannot be 0");
			return 0;
		}
	}
}
