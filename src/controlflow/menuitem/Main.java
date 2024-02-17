package controlflow.menuitem;

import java.util.Scanner;

//Write a method to print menu items (use Switch case)
//• Display the price for item selected
//• 1 – Pizza
//• 2 – Pasta
//• Default – salad

public class Main {

	public static void main(String[] args) {
		int itemNo;
		Scanner scan =new Scanner(System.in);
		System.out.println("select 1 for pizza and 2 for pasta");
		itemNo = scan.nextInt();
		scan.close();
		MenuItem menuItem =new MenuItem(itemNo);
		menuItem.menuPrice();	
	}
}
