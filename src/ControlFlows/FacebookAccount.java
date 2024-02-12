package ControlFlows;

/*
 * Program Face book Account have registered user credentials and also have a method to retrieve user
 *  UserId or User Password. The main method is available on program Account Credentials retrieve.
 */

public class FacebookAccount {
	// Declaring Variables
	String registeredUserId = "Sandesh24";
	String registeredPassword = "qwert1234";
	String registeredPhone = "1234567899";

	// Creating a method to retrieve user id by using phone number
	public String RetrieveUserID(String phone) {
		if (phone.equals(registeredPhone)) {
			System.out.println("Your Facebook User Id is: " + registeredUserId);
			return registeredUserId;
		} else {
			System.out.println("Phone bnumber did not match with facebook account");
			return null;
		}

	}

	// Creating a method to retrieve user id by using phone number
	public String RetrievePassword(String userId) {
		if (userId.equals(userId)) {
			System.out.println("Your facebook Password is: " + registeredPassword);
			return registeredPassword;
		} else {
			System.out.println("User Id not match with your account. Please try again");
			return null;
		}
		
	}
	

}
