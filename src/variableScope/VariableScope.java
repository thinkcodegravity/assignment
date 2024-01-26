package variableScope;

import java.math.*;

public class VariableScope {

	public static void main(String[] args) {
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static double simpleInterest(int principle, int time, double rate) {
		double interest = (principle * time * rate) / 100;
		return interest;
	}
	
	public static double squareArea(double length) {
		double area = length * length;
		return area;
	}
	
	
	public static double circleArea(double radius) {
		double pi = Math.PI;
		double area = pi * Math.pow(radius, 2);
		return area;
	}
	
}


