public class AreaOfSquare {
    public double areaOfSquare(double side) {
        double area = side * side;
        return area; 
    }

    public static void main(String[] args) {
        double side = 5; 
        AreaOfSquare a = new AreaOfSquare();
        double area = a.areaOfSquare(side); // Corrected method name
        System.out.println("Area of Square: " + area);
    }
}
