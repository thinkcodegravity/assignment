package control_flow;

import java.util.Scanner;

public class Question6Test {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("enter 1. for Pizza");
			System.out.println("enter 2. for Pasta");
			
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
		
			Question6 q6 = new Question6();
			q6.menuItems(option);
			
			System.out.println("Do you want to order more [Y/N]");
			String choice = sc.next();
			if(choice.equalsIgnoreCase("Y")){
				System.out.println(option);
			}else {
				System.out.println("Thank you for your order!!");
				System.exit(0);
			}

	}

}
}