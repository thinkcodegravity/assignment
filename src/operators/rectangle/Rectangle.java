package operators.rectangle;

public class Rectangle {
	float length,breadth;
	public Rectangle(float length, float breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public float area() {
		return length*breadth;
	}
}
