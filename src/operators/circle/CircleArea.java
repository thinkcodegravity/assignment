package operators.circle;

public class CircleArea {
	float radius;
	float pie=3.1416f;
	
	public CircleArea(float radius) {
		this.radius =radius;
	}
	public float area() {
		return pie*radius*radius;
	}
}
