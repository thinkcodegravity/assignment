package Inheritance;

public class advancedCalculator extends Calculator {

	public void square(int num1) {
		System.out.println("The area of the square is: " + this.mul(num1, num1));
	}

	public void rectangle(int num1, int num2) {
		System.out.println("The area of the rectangle is: " + this.mul(num1, num2));
	}

	public static void main(String[] args) {
		advancedCalculator advCalc = new advancedCalculator();
		advCalc.square(5);
		advCalc.rectangle(5, 4);

	}

}
