package controlflow.phone;

import java.util.Scanner;

//Write a program that has-a registered phone, userid, password
//Create a method to retrieve userid. That will take input as phone and if phone
//matches registered phone return userid.
//• Create a method to retrieve password. That will take input as userid and if userid matches registered userid return password.


public class Main {

	public static void main(String[] args) {
		User user =new User();
		Scanner scan =new Scanner(System.in);
		System.out.println("TO RETREIVE UserId PRESS 1 and to retreive PASSWORD press 2");
		int userChoice= scan.nextInt();
		scan.nextLine();
		
		if(userChoice==1) {
			System.out.println("Enter your registered phone number");
			int num = scan.nextInt();
			user.checkNum(num);
			
		}else if(userChoice==2) {
			try {
				System.out.println("Enter your UserId");
				String id = scan.nextLine();
				id=id.toLowerCase();
				user.checkUser(id);
			}catch(Exception e) {
				e.printStackTrace();
				}
			}
		scan.close();
		}
}
