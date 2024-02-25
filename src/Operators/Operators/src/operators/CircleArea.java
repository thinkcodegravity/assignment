package operators;

public class CircleArea {
	float radius;
	float pi= 3.14f;
	public CircleArea(float radius) {
		this.radius = radius;
	}
	public float area() {
		float ar;
		ar= pi*radius*radius;
		return ar;
	}

}
