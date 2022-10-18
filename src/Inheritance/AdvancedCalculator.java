package Inheritance;

/*
	Write a program for advancedCalculator that inherits from Calculator.
	Method square takes 1 int input and returns int area of square. use multiply from parent.
	Method rectangle takes 2 int input and returns int area of rectangle… use multiply method from parent.
*/

public class AdvancedCalculator extends Calculator {

	public static void main(String[] args) {
		AdvancedCalculator advancedCalculator = new AdvancedCalculator();
		advancedCalculator.square(4);
		advancedCalculator.rectangle(5, 4);

	}

	public int square(int length) {
		int areaOfSquare = mul(length, length);
		System.out.println("Area of Square is: " + areaOfSquare);
		return areaOfSquare;
	}

	public int rectangle(int length, int width) {
		int areaOfRectangle = mul(length, width);
		System.out.println("Area of Rectangle is: " + areaOfRectangle);
		return areaOfRectangle;
	}

}
