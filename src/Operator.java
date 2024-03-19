
LOGIC REQUIRED for all below programs using operators.

/*Bank program 
Has balance
does withdraw functionality  - include inputs , return outputs and logic.
does deposit functionality  - include inputs , return outputs and logic.*/

public class Operator {
 
}
public class Bank{
	 
	int balance;
	public double withdraw(double withdraw_Amt){
		double current_Bal = balance-withdraw_Amt;
		return current_Bal;
	}
	public double deposit(double deposit) {
		double current_Bal = balance +deposit;
		return current_Bal;
	}
}


//Method that can calculate sum of 3 numbers and return sum
public double addition(int a, int b, int c){ 
  int sum = a+b+c;
  return sum;
}

//Calculating simple interest with P T R as input and return simple interest. Include local variable that can calculate PTR/100.
public double CalculateInterest(double P, int T, double R) {
	double a = P*T;
	double b= a*R;
	double c = b/100;
	return c;
}
//Create a method that can calculate area of square
public double AreaOfSquare(double length, double breadth) {
	double area = length*breadth;
	return area;
	
}
//Accept side as input variable
public int AreaOfSquare(int side) {
	
}

//Use local variable to calculate area of square
public double AreaOfSquare() {
	double length;
	double breadth;
	double area = length*breadth;
	return area;
}
//Create a method that can calculate area of circle.
public double AreaOfCircle() {
	double radius;
	double area = radius*radius;
	return area;
}

//Accept radius as input variable
public double AreaOfCircle(double radius){
	double area = radius*radius;
	return area;
}

//Use local variable to calculate area of circle
public double AreaOfCircle() {
	double radius;
	double area = radius*radius;
	return area;
}

//Create a method that can calculate area of rectangle
public double AreaOfRectangle() {
	double length;
	double width;
	double area = 2*(length+width);
	return area;
	
}

//Create a method that can return total final amount , if input provided is product price and discount percentage.
public double PriceCalculator(double price,double discount) {
	double total_Amt = price - price * discount;
	return total_Amt;
	
}