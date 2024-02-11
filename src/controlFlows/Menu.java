package controlFlows;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("What is your choice?");
		int choice = sc.nextInt();
		
		String food;
		int cost;
		
		switch (choice) {
		
		case 1:
			food = "Pizza";
			cost = 10;
			break;
			
		case 2:
			food = "Pasta";
			cost = 9;
			break;
			
		default:
			food = "Salad";
			cost = 5;		

		}
		System.out.println(food);
		System.out.println(cost);
	}

}
