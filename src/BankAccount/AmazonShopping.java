package BankAccount;

import java.util.Scanner;


public class AmazonShopping {
	//User available balance to purchase product
	double balance=500.00;
	
	
	double productPrice=50.0;

	//Creating a method checkout
	public boolean Checkout(int orderQuantity) {
		
	double totalCartPrice=productPrice*orderQuantity;
	
	if(balance>totalCartPrice) {
		System.out.println("Checkout Successfull");
		return true;
	}
	else {
		System.out.println("Checkout failed. insufficient balance!");
		return false;
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
System.out.println("Please enter order quantity:");
Scanner sc=new Scanner(System.in);
int quantity=sc.nextInt();
AmazonShopping total=new AmazonShopping();
total.Checkout(quantity);



	}

}
