public class AreaOfSquare 
{
    public static double area(double side)
    {
        double area = side*side;
        return area;
    }
    public static void main(String args[]) {
		double s = 6;
		double ar = area(s);
		System.out.println("Area of square is" +ar );
	}

}
