package ControlFlows;


/*
	Write a program that has-a registered phone, userId, password.
  		a) Create a method to retrieve userId,that will take input as phone and if phone matches
   		   registered phone return userId. 
  		b) Create a method to retrieve password. That will take input as userId and if userId 
   		   matches registered userId return password.
 */

public class LoginAuthentication {

	long registeredPhoneNumber = 1729729726;
	String registeredUserId = "prabin.kunwar";
	String registeredPassword = "prabin123";

	public static void main(String[] args) {
		LoginAuthentication loginAuthentication = new LoginAuthentication();
		loginAuthentication.retriveUserId(1729729726);
		loginAuthentication.retrivePassword("prabin.kunwar");
	}

	public String retriveUserId(long inputPhoneNumber) {
		if (inputPhoneNumber == registeredPhoneNumber) {
			System.out.println("Your user Id is: " + registeredUserId);
			return registeredUserId;
		} else {
			System.out.println("Unable to retrive user Id. Phone number doesn't match.");
			return "Invalid phone number.";
		}
	}

	public String retrivePassword(String inputUserId) {
		if (inputUserId == registeredUserId) {
			System.out.println("Your password is: " + registeredPassword);
			return registeredPassword;
		} else {
			System.out.println("Unable to retrive password. User Id doesn't match.");
			return "Invalid user id.";
		}
	}
}
