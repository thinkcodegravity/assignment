package methodreturnstatement;

public class MethodReturnAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	Create a method that can accept appropriate input for payment webpage and returns payment response.
	public boolean payment(long cardNo,double amount, int securityCode) {
		return true;
	}
	
//	Create a method that can process registration
	public void processRegistration() {
		
	}
//	Create a method that can accept product input and calculate total cart value
//	Product program has quantity and price
	public double calculateTotalCard(int qty, double price) {
		return qty * price;
	}
	
//	Create a method that can calculate area of rectangle
	public void calcualateRectangle(double length, double width) {
		double rectange = length * width;
	}
	
//	Create a method that can calculate simple interest
	public void calculateInterest(double principalAmount, double rate, int period) {
		double interest = principalAmount*(rate/100)*period;
	}
	
//	Create a method that can process withdraw from bank account
	double balance;
	public boolean withdrawAmount(double withdrawAmount) {
		if(withdrawAmount > 0 && withdrawAmount >= balance) {
			balance = balance-withdrawAmount;
			return true;
		}else {
			return false;
		}
	}
	
//	Create a method that can process deposit from bank account
	double balance1;
	public void depositAmount(double deposit) { 
		balance1 = balance1 + deposit; 
	}
	
//	Create a method that can return electricity plan details if provided zip code as the input
	public String electricityPlan(int zipcode) {
		if(zipcode == 123) {
			return "plan";
		}else {
			return "no plan";
		}
	}
//	Create a method that can return insurance detail if provided input as age.
	public String insurance(int age) {
		if(age >= 18) {
			return "eligible for insurance";
		}else {
			return "no eligible";
		}
	}
//	Create a method that can return total amount if input provided is product price and discount percentage.
	public float calculateAmount(float price, float disc) {
		 float discAmt=(price*disc)/100;
		 return price - discAmt;
	}
//	Create a method that can return user profile if provided customers userid and password as the input
	public String userProfile(String userid, String password) {
		if (userid=="abc" && password=="123") {
			return "user profile";
		}else {
			return "no profile";
		}
	}
}
