package method_declaration;

public class MethodDeclarationPractice {

		
	
	public int payment(int amount ) {
		return amount;
	}
	
	public boolean registration() {
		return true;
	}
	
	public float productCost(float price, int number) {
		float totalCartValue = price * number;
		return totalCartValue;
	}
	
	public float areaOfRectangle(float length, float breath) {
		return length * breath;
	}
	
	public float sipleInterest(int principle, int time, int rate) {
		return (principle * time * rate)/100;
	}
	
	public int withdraw(int amount) {
		return amount;
	}
	
	public int deposit(int depositAmount) {
		return depositAmount;
	}
	
	public ElectricityPlanDetails electricityPlan(int zipCode) {
		ElectricityPlanDetails epd = new ElectricityPlanDetails();
		return epd;
	}
	
	public InsuranceDetail insurance(int age) {
		InsuranceDetail id = new InsuranceDetail();
		return id;
	}
	
	public float productPrice(float price, int discountRate) {
		float totalAmount = price - (price * discountRate)/100;
		return totalAmount;
	}
	
	public UserProfile customerDetail(String userId, String password) {
		UserProfile up = new UserProfile();
		return up;
	}

}

