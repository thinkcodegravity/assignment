package Operators;

public class Operator {
	
	public static void main(String[] args) {
		Operator op = new Operator();
		int sum = op.sum(5, 90, 2);
		int interest = op.simpleInterest(1000, 2, 5);
		System.out.println(sum);
		System.out.println(interest);
	}
	
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public int simpleInterest(int p, int t, int r) {
//		return ((p*t*r)/100);
		int interest = (p*t*r)/100;
		return interest;
	}
	
	public int squareArea(int side) {
		int area = side*side;
		return area;
	}
	
	public double circleArea(int radius) {
		double pi = Math.PI;
		double area = pi*Math.pow(radius, 2);
		return area;
	}
	
	public int rectArea(int length, int breadth) {
		int area = length * breadth;
		return area;
	}
	
	public double finalAmount(double price, double discount) {
		double disAmt = (discount/100) * price;
		double amt = price - disAmt;
		return amt;
	}

}
