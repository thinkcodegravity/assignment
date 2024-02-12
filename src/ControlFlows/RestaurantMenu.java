package ControlFlows;
import java.util.Scanner;
/*
 * Program Restaurant menu has a method menu which display the menu items with price.
 */
public class RestaurantMenu {
	//Declaring the variables
	double pizzaPrice=14.99;
	double pastaPrice=11.99;
	double saladPrice=10.99;
	
	
	//Creating a method to show the menu items with price
	
	public void Menu(int choice) {
		switch(choice) {
		case 1:
			System.out.println("Pizza: $"+pizzaPrice);
			break;
		case 2:
			System.out.println("Pasta:$"+pastaPrice);
			break;
			default:
			System.out.println("Salad $"+saladPrice);
			break;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Sandesh restaurant");
		System.out.println("Please choose 1 for Pizza, 2 for pasta and 3 for salad");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		RestaurantMenu choice=new RestaurantMenu();
		choice.Menu(option);
		

	}

}
