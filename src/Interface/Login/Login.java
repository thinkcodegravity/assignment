package Interface.Login;

/*
	Write a program for ILogin interface.
	Create abstract methods.
	Register method that return register is success or failure, and takes input userid and password and email.
	Login method that return login is success or failure, and takes input userid and password.
	Change password method that return change is success or failure, and takes input userid and newpassword.
*/

public class Login implements ILogin {

	public String registeredUserId;
	public String registeredPassword;
	public String registeredEmail;

	@Override
	public boolean register(String regUserId, String regPassword, String regEmail) {
		if (regUserId != null && regPassword != null && regEmail != null) {
			registeredUserId = regUserId;
			registeredPassword = regPassword;
			registeredEmail = regEmail;
			System.out.println("You have successfully created an account.\n");
			return true;
		} else {
			System.out.println("Unable to register your account. \n");
		}
		return false;
	}

	@Override
	public boolean login(String userId, String password) {
		if (userId.equalsIgnoreCase(registeredUserId) && password.equals(registeredPassword)) {
			System.out.println("Welcome " + registeredUserId + "!.You have successfully logged in.\n");
			return true;
		} else {
			System.out.println("Username or Password is incorrect.\n");
		}
		return false;
	}

	@Override
	public boolean changePassword(String userId, String newPassword) {
		if (userId.equalsIgnoreCase(registeredUserId)) {
			newPassword = registeredPassword;
			System.out.println("You have successfully changed your password.");
			return true;
		} else {
			System.out.println("Your userID or old password doesn't match.\nPlease try again.");
		}
		return false;
	}

	public static void main(String[] args) {
		Login login = new Login();
		login.register("Prabin", "abc123", "test@gmail.com");
		System.out.println("******************** ACCOUNT INFORMATION ********************");
		System.out.println("Your userid is: " + login.registeredUserId);
		System.out.println("Your password is: " + login.registeredPassword);
		System.out.println("Your email is: " + login.registeredEmail + "\n");

		System.out.println("******************** LOGIN MESSAGE **************************");
		login.login("Prabin", "abc123");

		System.out.println("******************** CHANGE PASSWORD ************************");
		login.changePassword("Prabin", "usa123");
	}
}

/*
 	--*-------*-------*-------- OUTPUT --------*--------*-------*--
	
	You have successfully created an account.
 	******************** ACCOUNT INFORMATION ********************
	Your userid is: Prabin
	Your password is: abc123
	Your email is: test@gmail.com

 	******************** LOGIN MESSAGE **************************
	Welcome Prabin!.You have successfully logged in.

 	******************** CHANGE PASSWORD ************************
	You have successfully changed your password.
*/
