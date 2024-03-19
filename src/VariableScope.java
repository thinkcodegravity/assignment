//Car program has Vin and transportation type
public class VariableScope {
	int vin;
	String transportation;
	
}
	
//Product program has quantity , name , price
public class Apple{
	
	int quantity;
	String name;
	double price;
}

//Bank program does withdraw functionality that takes withdraw amount as input

public class Bank(int withdraw) {
	
	int total;
	int currentTotal = total-withdraw;
	
}

//Method that can calculate sum of 3 numbers and return sum
public class Addition(int a, int b, int c){
	int sum = a+b+c;
	return sum;
	
}

//Calculating simple interest with P T R as input and return simple interest. Include local variable that can calculate PTR/100.
public class Mathematics{
	public double CalculateInterest(double principal, int time, double rate) {
		double a = principal * time * rate ;
		double b = a/100;
		return b;
	}
}

//Create a method that can calculate area of square
public double AreaOfSquare(int length, int breadth) {
	
	int area = length*breadth;
	return area;
}

//Accept side as input variable
public class Restaurant{
 String side;
 public String food(side) {
 }	
}

//Use local variable to calculate area of square
public double AreaOfSquare(){
	int length;
	int breadth;
	int area = length*breadth;
	return area;
	
}
//Chase Bank Account program has bank name, customer names, balance.
public class Customeraccount{
	String bank_Name;
	String cust_Name;
	double cust_Balance;
	
}

//Amazon program has method changePassword that takes userid and new password and confirms if password update was success or failure
public String changePassword(String userid, String newpassword) {
	String password;
	if (password!= newpassword) {
		System.out.print("Password update was successful!");
	}
	else { 
		System.out.print("Password update failed. Please enter new password!");	
	}
}

//Create a local variable age
public int population() {
	int age;
}

//Create a method that can calculate area of circle.
public double AreaOfCircle(double radius) {
	double area = radius*radius;
	return area;
}
//Accept radius as input variable

public int circle(int radius) {
	
}

//Use local variable to calculate area of circle
public double AreaOfCircle() {
	double radius;
	double area = radius*radius;
	return area;
}
}


