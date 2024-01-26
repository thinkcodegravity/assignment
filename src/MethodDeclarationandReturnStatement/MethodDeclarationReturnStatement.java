package MethodDeclarationandReturnStatement;

public class MethodDeclarationReturnStatement {
//	Create a method that can accept appropriate input for payment webpage and returns payment response
	public boolean response(float amount) { 
		return true;
	}
//	Create a method that can process registration
	public boolean registration(String name, String dob) {
		// if success return true
		return true;
	}
/*Create a method that can accept product input and calculate total cart value
Product program has quantity and price
*/
	double total(int quantity, float price) {
		int quant = 5;
		float prices = 50.5f;
		float tot = quant*prices;
		return tot;
	}
//	Create a method that can calculate area of rectangle
	float area (float length, float breadth) {
		float len = 5.5f;
		float br = 6.4f;
		float ar = len*br;
		return ar;
	}
//  Create a method that can calculate simple interest
	double simpleinterest(float principal, float time, float rate) {
		float p = 50000.00f;
		float t = 2.50f;
		float r = 0.045f;
		float i = p*t*r;
		return i;
	}
// Create a method that can process withdraw from bank account
	boolean withdrawAmount(float withdrawnAmount) {
		// if success than return true
		return true;
	}
	boolean depositAmount (float depositAmount) {
		// After successful deposit return true 
		return true;
	}
// Create a method that can return electricity plan details if provided zip code as the input
	public String electricityPlanDetails(long zipcode) {
		long zip = 57069;
		String plan = " The plan detail for you costs $50 per month.";
		return plan;
	}
// Create a method that can return insurance detail if provided input as age.
	String insuranceDetails(short age) {
		short ages = 53;
		String details = "Your insurance plan for this afe costs $200 per month."; 
		return details;
	}
//	Create a method that can return total amount if input provided is product price and discount percentage.
	float totalAmount(float productPrice, float discountPercentage) {
		float price = 34.5f;
		float disc = 0.34f;
		float totamt = price-(price*disc);
		return totamt;
	}
//	Create a method that can return user profile if provided customers userid and password as the input
	public String usrProfile(int userid, String password) {
		int id = 1264463;
		String pw = "$@dffds-CS12";
		String prof = "This is a profile of Juston.";
		return prof;
		
	}

}
