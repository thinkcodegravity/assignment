package controlFlows;
import java.util.Scanner;

public class CustomerCare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("What is your choice?");
		int choice = sc.nextInt();
		
		if (choice == 1) {
			System.out.println("customer care");
		}
		
		else {
			System.out.println("other help");
		}
	}

}
