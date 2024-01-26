package Methods;

public class Methods {
	
	//Create a method that can accept appropriate input for payment webpage and returns payment response.
	public static String webPayment(String cardNo, double total, int securityCode, String accountName) {
		return "Your payment for $" + total + " is successful";
	}
	//Create a method that can process registration
	public static boolean register(String firstName, String lastName, String email, String password, String dob) {
		return true;
	}
	
	//Create a method that can accept product input and calculate total cart value
	public static double calculateCartValue(double productPrice, int productCount) {
		return productPrice * productCount;
	}
	
	//Product program has quantity and price
	public static double product(int quantity, double price) {
		return quantity * price;
	}

	//Create a method that can calculate area of rectangle
	public static double rectangleArea(double length, double breadth) {
		return length * breadth;
	}
	
	//Create a method that can calculate simple interest
	public static double calculateSimpleInterest(float principle, int time, double rate) {
		return (principle * time * rate) /100;
	}
	
	//Create a method that can process withdraw from bank account
	public static double withDrawAmount(double balance, double amount) {
		return balance - amount;
	}
	
	//Create a method that can process deposit from bank account
	public static long depositAmount(long balance, long amount) {
		return balance + amount;
	}
	
	//Create a method that can return electricity plan details if provided zip code as the input
	public static String electricityPlan(int zipcode) {
		if (zipcode == 12345) {
			String plan = """
					Address: 123 Street Name, City, ST, 12345,\n
					Electricity price: 10/unit,\n
					Late fee: 1/day.\n
					""";
			return plan;
		}
		return "";
	}
	
	//Create a method that can return insurance detail if provided input as age.
	public static String insuranceDetail(int age) {
		if (age >= 60) {
			return "Insurance cost/month: $500";
		} else if (age <=59 && age >= 20) {
			return "Insurance cost/month: $250";
		}
		return "Insurance cost/month: $100";
	}
	
	//Create a method that can return total amount if input provided is product price and discount percentage.
	public static double totalAfterDiscount(double price, double discountPer) {
		double discountAmt = (discountPer/100) * price;
		return price - discountAmt;
	}
	
	//Create a method that can return user profile if provided customers userid and password as the input
	public static String userProfile(String userId, String password) {
		if (userId != null && password != null) {
			return """
					UserId: 00123,
					UserName: Unish Rajkarnikar,
					EmailAddress: 4224 Java Street, Spring, TL, 55255
					""";
		}
		return "";
	}
}
