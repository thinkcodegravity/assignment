package inheritance.cart;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int productPrice, quantity;
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter product price:");
		productPrice =scan.nextInt();
		Cart cart =new Cart();
		System.out.print("Enter no of quantity:");
		quantity =scan.nextInt();
		System.out.println("the total price is:$"+cart.mul(productPrice,quantity));
		scan.close();
	}

}
