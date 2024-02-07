package operators;

import java.util.Scanner;

//Create login program
//(has-a)Declare global variable registerUserid and register password
//Create login method that takes loginUserid and login password
//Print if login is success or failed

public class Login {

	static String registerUserid = "admin";
	static String password = "123";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("Enter User Name: ");
			String userid = sc.next(); 
			System.out.print("Enter Password: ");
			String pass = sc.next(); 
			login(userid,pass);
		}
	}
	
	public static void login(String userid,String pass) {
		if(registerUserid.matches(userid)&& password.matches(pass)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
