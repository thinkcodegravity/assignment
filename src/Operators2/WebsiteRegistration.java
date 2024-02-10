package Operators2;

import java.util.Scanner;
/*
 * Web Registration program is designed to register any new user Account with different user id which is not matching 
 * existing user id. If the new user id is different than existing user id then registration success
 * else registration fail
 */

public class WebsiteRegistration {

	// program WebsiteRegistration has a global variable
	// declare and initialize the global variable of program
	String existingUserId = "Sandesh24";

	public void registerAccount(String newUserId, String newPassword) {

		if (existingUserId.equals(newUserId)) {
			System.out.println("Username already taken. Please try to create with different User Name.");

		}

		else {
			System.out.println("Registration Successfull!");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***************Welcome to xyz Website*************");
		WebsiteRegistration reg = new WebsiteRegistration();

		// Creating a object sc from Scanner to take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Please create your User Id below:");
		String Id = sc.nextLine();
		System.out.println("Please create your password below: ");
		String Password = sc.nextLine();
       //Method calling with the value input from the user
		reg.registerAccount(Id, Password);

		sc.close();

	}

}
