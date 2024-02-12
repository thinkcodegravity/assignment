package ControlFlows;

import java.util.Scanner;
/*
 * Account Credentials retrieve program have main method which is useful for Facebook Account program
 * in order to retrieve User UserId or Password
 */
public class AccountCredentialsRetrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to FaceBook Support");
		FacebookAccount fb = new FacebookAccount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select option 1 to retrieve user id or select 2 to retrieve password");
		int option = sc.nextInt();
		if (option == 1) {
			System.out.println("Please enter your phone number to retrieve User Id:");
			Scanner sc1 = new Scanner(System.in);
			String enteredPhone = sc1.nextLine();
			fb.RetrieveUserID(enteredPhone);

		} else if (option == 2) {
			System.out.println("Please enter your User Id to retrieve Password:");
			Scanner sc2 = new Scanner(System.in);
			String enteredPhone = sc2.nextLine();
			fb.RetrievePassword(enteredPhone);
		} else {
			System.out.println("Invalid Option. Please try again");
		}

	}

}
