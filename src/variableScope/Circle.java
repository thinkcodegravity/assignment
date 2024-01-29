package variableScope;

public class Circle {
	
	public static float areaofCircle(float radius) {
		float area = 22/7 *radius * radius;
		return area;
		
	}
	public static void main(String[] args) {
		float r = 4;
		float a = areaofCircle(r);
		System.out.println("Area of circle "+a);
	}

}
