package inheritance;

	/*
	 	Write a program for advancedCalculator that inherits from Calculator
		Method square takes 1 int input and returns int area of square. 
		use multiply from parent
		Method rectangle takes 2 int input and returns int area of rectangle… use multiply method from parent
	 */

public class AdvanceCalculator extends Calculator{
	


public static void main ( String [] args) {
	int a = 9; int b=6;


	
	Calculator CL = new Calculator();
	int square = CL.mul(b, b);
int rectangle = CL.mul(a, b);
System.out.println("Area of rectangle: "+ rectangle);
System.out.println("Area of Squrae: " + square);
}

	
	
}


	