package operators;

import java.util.Scanner;

//Create a method that can return total final amount , 
//if input provided is product price and discount percentage

public class CalculateFinalAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Product Price: ");
		float price = sc.nextFloat(); 
		System.out.print("Enter the Discount(%): ");
		float disc = sc.nextFloat(); 
		finalPrice(price,disc);
	}
	
	public static void finalPrice(float price, float disc) {
		float finalPrice = price - (price*disc)/100;
		System.out.print("Product Final Price: "+finalPrice);
	}

}
