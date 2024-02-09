package Operators;

public class AreaOfRectangle {
	// method to calculate area of rectangle

		public double RectangleArea(double length, double width) {
			double areaOfRectangle = length * width;
			System.out.println("Area Of Rectangle: " + areaOfRectangle + " square unit.");
			return areaOfRectangle;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating a reference area
				AreaOfRectangle a = new AreaOfRectangle();// method calling statement
				a.RectangleArea(5.5, 4.5);// passing the value length=5.5 unit and width=4.5 unit
				// TODO Auto-generated method stub

	}

}
