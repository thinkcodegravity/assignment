package Inheritance;

/*Write a program for advancedCalculator that inherits from Calculator
Method square takes 1 int input and returns int area of square. use multiply from parent
Method rectangle takes 2 int input and returns int area of rectangle… use multiply method from parent
*/
  
public class advancedCalculator extends Calculator{
	
	public int square (int a) {
		a = 5;
		int areaofSquare = mul (5,5);
		System.out.println("areaofSquare:" + areaofSquare);
		
		return areaofSquare;
	}
	
	public int rectangle (int a, int b) {
		
		a = 5;
		b = 6;
		int areaofRectangle = mul (5,6);
		System.out.println("areaofRectangle :" + areaofRectangle);
		
		return rectangle(0, 0);
	}
} 
