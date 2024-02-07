
public class MethodDeclaration {

	
	public String processPayment(String cardNumber, String expiryDate, double amount) {
	    return "Payment successful!";
	}
	
	public void processRegistration(String username, String password, String email) {
	}
	
	public double calculateTotalCartValue(int quantity, double price) {
	    return quantity * price;
	}
	
	public double calculateRectangleArea(double length, double width) {
	    return length * width;
	}

	public double calculateSimpleInterest(double principal, double rate, int time) {
	    return (principal * rate * time) / 100.0;
	}

	public double withdrawFromAccount(double currentBalance, double amountToWithdraw) {
	    return currentBalance - amountToWithdraw;
	}

	public double depositIntoAccount(double currentBalance, double amountToDeposit) {
	    return currentBalance + amountToDeposit;
	}

	public String getElectricityPlanDetails(String zipCode) {
	    return "Standard Electricity Plan";
	}

	public String getInsuranceDetails(int age) {
	    return "Standard Insurance Plan";
	}

	public double calculateTotalAmount(double productPrice, double discountPercentage) {
	    return productPrice - (productPrice * discountPercentage / 100.0);
	}

	public String getUserProfile(String userId, String password) {
	    return("User profile");
	}




}
