public class AreaOfCircle {
    public double areaOfCircle(double r) {
        double area = 22/7*r*r;
        return area; 
    }

    public static void main(String[] args) {
        double radius = 5; 
        AreaOfCircle a = new AreaOfCircle();
        double area = a.areaOfCircle(radius); // Corrected method name
        System.out.println("Area of Square: " + area +" cm*cm.");
    }
}

