package Operators;

public class AreaOfSquare {
	// method to calculate area of square

	public double SquareArea(double length) {
		double areaOfSquare = length * length;
		System.out.println("Area Of Square: " + areaOfSquare + " square unit.");
		return areaOfSquare;
	}

	public static void main(String[] args) {
		// creating a reference a
		AreaOfSquare a = new AreaOfSquare();// method calling statement
		a.SquareArea(5.5);// passing the value length=5.5 unit
		// TODO Auto-generated method stub

	}

}
