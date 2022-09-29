package control_flow;

import java.util.Scanner;

public class Question3 {
	/*
	 * Write a program that has-a registered phone, userid, password
	   Create a method to retrieve userid. That will take input as phone and if phone matches registered phone return userid.
	   Create a method to retrieve password. That will take input as userid and if userid matches registered userid return password.
	 */
	
	long phoneRegister = 987654321;
	String userId = "John321";
	String password = "@java123";
	
	public String idRegistration(long phoneInput) {
		if(phoneInput == phoneRegister) {
			return userId;
		}else {
			return "Invalid userName";
		}	
	}
	
	public String pwdRegistration(String loginUserId) {
		if(loginUserId == userId) {
			return password;
		}else {
			return "Invalid passsword";
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question3 qq = new Question3();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the phone number");
		long phone = sc.nextLong();
		String userName = qq.idRegistration(phone);
		System.out.println(userName);
		
		System.out.println("enter your login user Id");
		String login = sc.nextLine();
		String userPassword = qq.pwdRegistration(login);
		System.out.println(userPassword);
	}
}
