package inheritance;

public class AdvancedCalculator extends Calculator {

//	Write a program for advancedCalculator that inherits from Calculator
//	Method square takes 1 int input and returns int area of square. use multiply from parent
//	Method rectangle takes 2 int input and returns int area of rectangle… use multiply method from parent
	
	public int square(int l) {
		return super.mul(l,l);
	}
	
	public int rectangle(int l, int b) {
		return super.mul(l,b);
	}
	
	
}
