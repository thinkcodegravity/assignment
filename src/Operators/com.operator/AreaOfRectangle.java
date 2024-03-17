public class AreaOfRectangle 
{
    public double areaOfRectangle(double sideA, double sideB)
    {
        double area = sideA * sideB;
        return area;
    }

    public static void main(String[] args) {
        double A = 5; 
        double B = 5; 
        AreaOfRectangle a = new AreaOfRectangle(); 
        double area = a.areaOfRectangle(A, B); 
        System.out.println("Area of Rectangle: " + area);
    }


}
