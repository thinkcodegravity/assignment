package variableScope;

//Create a method that can calculate area of square
//• Accept side as input variable
//• Use local variable to calculate area of square

public class SquareArea {
public void areaofSquare(float a) {//parametric variable
	float area;//delcaration of local scope variable--short term memory
	area= a*a;//logic
	System.out.println(area);
	}
}
