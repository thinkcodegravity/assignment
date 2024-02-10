package method;

public class Methods {
	public boolean paymentResponse(Payment paymentDetails, CreditCardDetails creditCard) {
		return false; 
	}
	public void registration(String name, int id) {
		
	}
	public double totalCartValue(int quantity, double price) {
		return 0.0; 
	}
	public double area(double length, double width) {
		return 0.0; 
	}
	public double simpleInterest(double principal, double rate, double time) {
		return 0.0; 
	}
	public double withdraw(double currentBalance, double amount) {
        return 0.0;
    }

    public double deposit(double currentBalance, double amount) {
        return 0.0;
    }

    public ElectricityPlanDetails electricityPlanDetails(String zipCode) {
        ElectricityPlanDetails electricityPlanDetails = new ElectricityPlanDetails(zipCode);
        return electricityPlanDetails;
    }

    public InsuranceDetail insuranceDetail(int age) {
        InsuranceDetail insuranceDetail = new InsuranceDetail(age);
        return insuranceDetail;
    }

    public double totalAmount(double productPrice, double discountPercentage) {
        return 0.0; 
    }

    public UserProfile userProfile(String userID, String password) {
    	UserProfile userProfile = new UserProfile(userID, password); 
    	return userProfile; 
    }

}
