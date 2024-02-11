package controlFlows;
import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		
		int balance = 5000;
		int prodPrice = 1000;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your product quantity");
		int prodQuant = sc.nextInt();
		
		int totalCart = prodQuant * prodPrice;
		
		if (totalCart <= balance) {
			System.out.println("Ready to checkout");
		}
		
		else {
			System.out.println("Insuffecient balance");
		}

	}

}
