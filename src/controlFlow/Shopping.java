package controlFlow;
import java.util.Scanner;
	/*
	 * Write a shopping program that has-a balance, product price
Create a checkout method that takes order quantity as input. Calculate total cart price 
based on quantity input and product price. If total cart prices
 is less than balance than return success else return failure

	 */
public class Shopping {
	double balance=100.02;
	double productPrice=52.06;
	 public String checkout(int qty){
		 double totalcart = productPrice*qty;
		 if (totalcart<balance) {
			return "success";
			 
		 }else {
			 return "failure";
		 }
	 }
	
	 public static void main(String[] args) {
	 Shopping sq = new Shopping();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of order");
		int orderNumber = sc.nextInt();
		String shopping = sq.checkout(orderNumber);
		System.out.println(shopping);


}
}

