package WeekOne;
import java.util.Scanner;
public class methodDeclarationAndReturn {
	
	public String paymentResponse() {
		 Scanner scanner = new Scanner(System.in);

	      
	        System.out.println("Enter credit card number:");
	        String creditCardNumber = scanner.nextLine();

	        System.out.println("Enter expiration date (MM/YYYY):");
	        String expirationDate = scanner.nextLine();

	        System.out.println("Enter CVV:");
	        String cvv = scanner.nextLine();

	        System.out.println("Enter payment amount:");
	        double amount = scanner.nextDouble();
	        scanner.nextLine();
	       
	        String paymentDetails = "Credit Card: " + creditCardNumber +
	                                "\nExpiration Date: " + expirationDate +
	                                "\nCVV: " + cvv +
	                                "\nAmount: $" + amount;
	      System.out.println("Payment processed successfully!\n" + paymentDetails);
	    
	        return "Payment processed successfully!\n" + paymentDetails;
		
		
		
		
	}
	
	public void processRegistration() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name");
		String fullName = sc.nextLine();
		
		System.out.println("Enter your email");
		String emailAddress = sc.nextLine();
		
		System.out.println("Enter your DOB");
		String dob = sc.nextLine();
		
		System.out.println("Enter your username");
		String userName = sc.nextLine();
		
		System.out.println("Enter your password");
		String password = sc.nextLine();
		
		System.out.println("The registration has been sucessfully completed");
		
		}



	public float totalCartValue() {
		
		float TotalCart= 0.0f;
		boolean addToCart= true;
		while(addToCart) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the product name");
			String productName = sc.nextLine();
			
			System.out.println("Enter the product price");
			float productPrice = sc.nextFloat();
			
			System.out.println("Enter the quantity");
			float quantity = sc.nextFloat();
			
			sc.nextLine();
			
			float totalValueInCart= productPrice*quantity;
			
			TotalCart += totalValueInCart;
			
			System.out.println("Do you want to add more in the cart? (yes/no)");
			String addMore = sc.nextLine();
			
			
			
			addToCart = addMore.equals("yes");
			
			}
		System.out.println("total price : " + TotalCart);
		return TotalCart;
	}
	
	
	public float areaOfRectangle(float l, float b, float h) {
		float area= l*b*h;
		System.out.println("the area of is " + area);
		
		return area;
		
	}
	
	public float simpleInterest(float p, float i, float r) {
		float simpleinterest= (p*r*i)/100;
		System.out.println("the Simple interest of is " + simpleinterest);
		
		return simpleinterest;
		
	} 
	
	public void withdraw(float amt) {
		String name= "Nikita";
		float balance = 1000;
		if(amt<balance) {
			System.out.println("the withdrawl is successful");
		}
		else {
			System.out.println("insufficient fund");
		}
	}
	
	public void deposite(float amt) {
		String name= "Nikita";
		float balance = 1000;
		float Total = balance + amt;
		
			System.out.println("the total balance is " + Total);
		
	}
	
	public String electricity (int zipcode) {
		String plan;
		if(zipcode==63701) {
			plan = "Basic Plan";
		}
		else if (zipcode == 63702) {
			plan ="Standard Plan";
		
		}
		else {
			plan ="Normal Plan";
		}
		
		System.out.println(plan);
		return plan;
		
	}
	
	
	public String insurancePlan(int age) {
		String plan;
		if(age>1&& age<=30 ) {
			plan = "Basic Plan";
		}
		else if (age>30&& age<=60) {
			plan ="Standard Plan";
		
		}
		else {
			plan ="Normal Plan";
		}
		
		System.out.println(plan);
		return plan;
		
	}
	
	
	public float totalamt(float price, float discount) {
		float total = price - ((discount/100)*price);
		System.out.println(total);
				return total;
	}
	
	public String userProfile(String userid, String password) {
		String plan;
		if (userid=="Nikita" && password =="Nikita1") {
			plan = "Login successful";
			}
		else {
			plan = "failed";
			
		}
		
		System.out.println(plan);
		return plan;
	}
	
	
}