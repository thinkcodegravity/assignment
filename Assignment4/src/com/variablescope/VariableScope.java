package com.variablescope;

public class VariableScope {
	
		//Method that can calculate sum of 3 numbers and return sum
	
	public int add(int first_num, int sec_num, int third_num) {
		first_num = 1;
		sec_num = 2;
		third_num = 4;
		
		int sum = first_num + sec_num + third_num;
		
		return sum;
	}
	//Calculating simple interest with P T R as input and return simple interest. Include local variable that can calculate PTR/100.
	
	public double simpleInterest(double principal, double time, double rate) {
		//local variable that hold calculated simple interest
		double simpleInterest = (principal * time * rate)/100 ;
		return simpleInterest;
		
	}
	
	//Create a method that can calculate area of square
	public double areaOfSquare(int side) {
		// local variable that hold the calculated area
		double area = side * side;
		return area;
	}
	
	//Create a local variable age
	int age = 25;
	//Create a method that can calculate area of circle.
		//Accept radius as input variable
		//Use local variable to calculate area of circle
	public double areaCircle(double radius) {
		double area = Math.PI * radius * radius;
		return area;
	}




}
