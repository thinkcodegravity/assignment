package methodDeclaration;

public class MethodDeclaration_ReturnStatement {
//	Focus only on method declaration and include proper return statements. No logic required.
	 
	 
//			Create a method that can accept appropriate input for payment webpage and returns payment response.
			
			public boolean paymentPage(long cardNumber,int zipCode,short securityCode) {
				return true;
			}
			
//			Create a method that can process registration
			
			public void processingRegistration(String userId,String passWord,String dateOfBirth) {
				
			}
			
//			Create a method that can accept product input and calculate total cart value
//			Product program has quantity and price
			
			public double cartTotal(int quantity,double price) {
				return quantity*price;
			}
			
//			Create a method that can calculate area of rectangle
			
			public float areaOfRectangle(float length,float breadth) {
				return length*breadth;
			}
			
//			Create a method that can calculate simple interest
			
			public double simpleInterest(double principle,short time,double rate) {
				return (principle*time*rate)/100;
			}
			
//			Create a method that can process withdraw from bank account
			
			public String amountWithdrawal(int amountToWithdraw) {
				long bankBalance;
				if(amountToWithdraw<=bankBalance && bankBalance>0) {
					return " Success!";
				}else {
					return " Can't process Withdrawal!";
				}
				
			}
			
//			Create a method that can process deposit from bank account
			public long amountDeposit(long amountAdded) {
				long totalBalance;
				return totalBalance=totalBalance+amountAdded;
			}
//			Create a method that can return electricity plan details if provided zip code as the input
			
			public String electricityPlansDetails(int zipCode) {
				return " Your Plans details are as follows:";
			}
			
//			Create a method that can return insurance detail if provided input as age.
			
			public String insuranceDetails(int age) {
				return "Your insurance details are as follows:";
			}
			
//			Create a method that can return total amount if input provided is product price and discount percentage.
				
			public double totalAmount(double productPrice,double discountPercent) {
				double TotalAmount=productPrice*(discountPercent/100);
				return TotalAmount;
			}
					
//			Create a method that can return user profile if provided customers userid and password as the input
			
			public String userProfile(String userID,String password) {
				return " Your Profiles are as follows:";
			}

}
