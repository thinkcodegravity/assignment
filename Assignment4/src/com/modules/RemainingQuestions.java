package com.modules;

public class RemainingQuestions {
	
	
	// Create a method that can return electricity plan details if provided zip code as the input
	
	public String electricityPlanDetails(int zipCode) {
		return ("The plan of electrit");
	}
	
	// Create a method that can return insurance detail if provided input as age.
	
	public String insuranceDetails(int age) {
		return ("The details of insurance by age" +age);
	}
	
	
	// Create a method that can return total amount if input provided is product price and discount percentage.

	public String totalAmount(int price, double percentage) {
		
		double total_price = price - (price*percentage/100);
		
		return ("The total amount is " +total_price);
	}
	
	// Create a method that can return user profile if provided customers userid and password as the input     

	public String customers(int userid, int password) {
		return ("The profile of user is " +userid);
	}

}                                                                                                            
