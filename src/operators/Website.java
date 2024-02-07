package operators;

import java.util.Scanner;

/*
Create website program
(has-a)Declare global variable existingUserid 
Create register method that takes new registeration userid and password
Based on If exsting userid matches new registeration id then registration fails 
else registeration method print success or failure.
*/
public class Website {

	static String existingUserid = "admin"; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("Enter User Name: ");
			String userid = sc.next(); 
			System.out.print("Enter Password: ");
			String pass = sc.next(); 
			registration(userid,pass);
		}
	}
	
	public static void registration(String userid,String pass) {
		if(existingUserid.matches(userid)) {
			System.out.println("Failed");
		}else {
			System.out.println("Success");
		}
	}

}
