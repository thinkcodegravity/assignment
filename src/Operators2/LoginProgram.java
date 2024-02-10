package Operators2;

/*
 * Login program have a  global variable registerUserid and register password and also have a method called
 * Login that takes loginUserid and login password as input
 * this program is built to check weather login attempt is success or fail.

 */
public class LoginProgram {

	// Declaring global variables
	String registerUserId = "Sandesh24";
	String registerPassword = "Qwert1234%";

	// Creating a method Login
	public boolean Login(String loginUserid, String loginPassword) {
		//
		if(registerUserId == loginUserid && registerPassword == loginPassword) {
			System.out.println("Login Successfully!");
			return true;
		} else {
			System.out.println("Login failed. Please try again!");
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
