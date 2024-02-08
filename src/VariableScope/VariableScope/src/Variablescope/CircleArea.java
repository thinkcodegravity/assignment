package Variablescope;

public class CircleArea {
	public static double Area(double radius) {
		double area  = 22/7 * radius * radius;
		return area;
		}
	public static void main(String args[]) {
		double r = 5;
		double ar = Area(r);
		System.out.println("Area of circle is" +ar );
	}
}
