public class AreaOfCircle {

    public static double Area(double r) {
		double area  = 22/7 * r * r;
		return area;
		}
	public static void main(String args[]) {
		double r = 6;
		double ar = Area(r);
		System.out.println("Area of circle is" +ar );
	}

}
