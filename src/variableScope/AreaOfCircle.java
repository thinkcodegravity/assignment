package variableScope;

//Create a method that can calculate area of circle.
//• Accept radius as input variable
//• Use local variable to calculate area of circle

public class AreaOfCircle {
	
	public float circleArea(float radius) {//parametric variable
		float area=0;//local variable
		float pie= 3.1416f;//local variable declaration and initialization
		area= pie*radius*radius;//logic
		return area;//returntype method
		
	}
}
