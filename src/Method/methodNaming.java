package Method;

import java.util.Scanner;
public class methodNaming {
     
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the debit/credit card number: " );
		int a = in.nextInt();
	    System.out.print("Enter CVV number: ");
	    int b = in.nextInt();
	    System.out.print("Enter the expiry date: ");
	    int c = in.nextInt();
	    System.out.print("Enter the amount to deposit: ");
	    int d = in.nextInt();
	    System.out.print("Enter the amount to withdraw: ");
	    int e = in.nextInt();
	    int balance=0;
	    int newbalance = balance + d -e;
	    System.out.print(newbalance);
		
	}
}

//Create a method that can accept appropriate input for payment webpage and returns payment response.
 public class MethodConvention{
	 
	 public int PaymentProcessing(int deposit, int withdraw) {
		 
		 int balance = 0;
		 deposit = 500;
		 withdraw = 100;
		 int currentBalance = balance + deposit - withdraw;
		 return currentBalance;
	 }
 }
 
 //Create a method that can process registration
 
 public class Registration{
	 
	 public int booking(String name, int room_num) {
		 boolean registration;
		 name ="Raya";
		 room_num = 101;
		 if(name!=null && room_num <0 );{
			registration = true; 
		 }
 }
 
// Create a method that can accept product input and calculate total cart value
	 
public class Product{
   public double CalculateCart(double item1, double item2) {
	   item1 = 5.0;
	   item2 =10.0;
	   final double tax = 0.083;
	   double total =0.0;
	   double currentTotal = (item1 + item2)*tax;
	   return currentTotal;
	    }	
}	 



// Create a method that can calculate area of rectangle

public class Rectangle{
	public double AreaOfRectangle(double length, double breadth) {
		
		double area = length*breadth;
		return area;
		}
	}
}

 //Create a method that can calculate simple interest
 public class Interest{
	 public double CalculateInterest(double principal, int time, double rate) {
		 
		 double simpleInterest = (principal*time*rate)/100;
		 return simpleInterest;
	 
	                                                                      	                                                                     	 
 }
// Create a method that can process withdraw from bank account
public class Bank{
  public double ProcessWithdraw(double withdrawAmount) {
	  
	  double total;
	  double currentAmount = total - withdrawAmount;
	  return currentAmount;
  }		 
 
	 
}	 
 //Create a method that can process deposit from bank account

public class Bank{
	  public double ProcessDeposit(double deposit) {
		  
		  double total;
		  double currentAmount = total + deposit;
		  return currentAmount;
	  }
}
 //Create a method that can return electricity plan details if provided zip code as the input
public class Entergy{
  public String electricity(int zipcode) {
	  String electricityPlan;
	  if(zipcode < 75045 && zipcode < 75045) {
		  electricityPlan = "monthly";
	  }
	  else
		  electricityPlan = "quarterly";
	  return electricityPlan;
	  	  
  }	
}

 //Create a method that can return insurance detail if provided input as age.
public class Insurance{
 public String insurancePlan() {
	 int age;
    if (age!=0) {
     String insuranceDetails;
	 return insuranceDetails;
	 }
 }	


// Create a method that can return total amount if input provided is product price and discount percentage.
public class Walmart{
  public double calculatePrice(double price, double discountPercent) {
	  double initialPrice;
	  double total = initialPrice - price*discountPercent;
	  return total;
	   }
}


// Create a method that can return user profile if provided customers userid and password as the input
public class Amazon{
 	public String login(String userid, String password) {
 	   String userProfile;
 	   return userProfile;
 	 
 	}
}

