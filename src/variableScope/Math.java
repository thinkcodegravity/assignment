package variableScope;

public class Math {
	  private static final double PI = 3.14159;

	public int sum(int num1, int num2, int num3) {
	        return num1 + num2 + num3;
	    }
	    
	    public double calculateSimpleInterest(double principal, double rate, int time) {
	        double interest = (principal * rate * time) / 100;
	        return interest;
	    }
	    
	    public double areaOfSquare(double side) {
	        double area = side * side;
	        return area;
	    }
	    
	    public double areaOfCircle(double radius) {
	        double area = Math.PI * radius * radius;
	        return area;
	    }
}
