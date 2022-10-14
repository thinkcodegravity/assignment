package inheritanceAssignment;

/*
 	Write a program for advancedCalculator that inherits from Calculator
	Method square takes 1 int input and returns int area of square. use multiply from parent
	Method rectangle takes 2 int input and returns int area of rectangle… use multiply method from parent
*/

public class AdvancedCalculator extends Calculator{
	
	public int square(int l) {
		int areaOfSquare = mul(l, l);
		return areaOfSquare;
	}
	
	public int rectangel(int x, int y) {
		int areaOfRectangle = mul(x, y);
		return areaOfRectangle;
	}

	public static void main(String[] args) {
		AdvancedCalculator ac = new AdvancedCalculator();
		int areaOfSquare = ac.square(12);
		System.out.println("The are of square is : " + areaOfSquare);
		
		int areaOfRectangle = ac.rectangel(12, 12);
		System.out.println("The area of Rectangle is : " + areaOfRectangle);

	}

}
