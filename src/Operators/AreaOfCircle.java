package Operators;

public class AreaOfCircle {
	// Creating a method to calculate area of circle

	public double areaOfCircle(double radius) {
		double pi = 3.14; // Constant value of pi.
		double CircleArea = pi * radius * radius;
		System.out.println("Area Of circle: " + CircleArea + " square unit.");
		return CircleArea;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a reference 'area'
		AreaOfCircle area = new AreaOfCircle();
		area.areaOfCircle(6.2);// passing r=6.2 unit

	}

}
