package Interface1;
import java.util.Scanner;
public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILogin log=new Login();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Choose Option: 1. Registration 2.Login 3.Change Password");
		int choice=sc.nextInt();
		sc.nextLine();
		if(choice==1) {
			//if user chose to register new account
			System.out.println("Please Create Username: ");
			String userName=sc.nextLine();
			sc.nextLine();	
			System.out.println("Please write your email: ");
			String userEmail=sc.nextLine();
			
			System.out.println("Please Create your Secure Password: ");
			String userPassword=sc.nextLine();
			
			log.register(userName, userPassword, userEmail);
			}
		else if(choice==2) {
			//if user choose to login account
			System.out.println("Please Type Username: ");
			String userName=sc.nextLine();
			sc.nextLine();
			System.out.println("Please type your Password: ");
			String userPassword=sc.nextLine();
			log.login(userName, userPassword);
		}
		else if(choice==3) {
			System.out.println("Please Type Username: ");
			String userName=sc.nextLine();
			System.out.println("Please create your new Password: ");
			String newPassword=sc.nextLine();
			log.changePassword(userName, newPassword);
		}
		else {
			System.out.println("invalid option choosen. Please try again");
		}
		sc.close();
			
			
		}
		}


