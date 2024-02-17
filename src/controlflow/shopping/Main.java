package controlflow.shopping;

import java.util.Scanner;

//Write a shopping program that has-a balance, product price
//Create a checkout method that takes order quantity as input.
//Calculate total cart price based on quantity input and product price. 
//If total cart prices is less than balance than return success else return failure

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		float bal= 450.50f;
		Shopping user =new Shopping(bal, 1.99f);
		System.out.println("enter no of quantity");
		int n =scan.nextInt();
		bal = user.checkOut(n);
		System.out.println("remaining balance $"+bal);
	}

}
