package inheritance;
/*
 * Write a program for Cart that inherits from calculator
Method calculateCart that takes 2 int input product price and quantity and returns total value of cart.. Use parent method multiply.
 

 */

public class Cart extends Calculator {
	 
	public int Calculate(int price, int qty) {
		int total=mul(price, qty);
		return total;
		
	}
	
	public static void main (String[]args) {
		Cart calc= new Cart();
		int total=calc.Calculate(79,5);
		System.out.println("The total Value : "+ total);
		
		
	}

}
