package variablescope;

public class Sum {
	
//	Method that can calculate sum of 3 numbers and return sum

	public int Calculate(int x, int y, int z) {
		return x+y+z;
	}
	
//	Calculating simple interest with P T R as input and return simple interest. Include local variable that can calculate PTR/100.

	public double calculateInterest(double PTR) {
		double lc = PTR/100;
		return lc;
	}
	/*
	Create a method that can calculate area of square
	Accept side as input variable
	Use local variable to calculate area of square
	*/
	public void CalculateArea(double side1, double side2) {
		double area = side1 * side2;
	}
	
//	Create a local variable age
	public void setAge(int age) {
		
	}
	

}
