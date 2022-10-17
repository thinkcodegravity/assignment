package Inheritance;

/*Write a program for Cart that inherits from calculator
Method calculateCart that takes 2 int input product price and quantity and returns total value of cart.. Use parent method multiply.
*/

public class Cart extends Calculator {
	
	public int CalculateCart () {
		
		int productPrice = 100;
		int quantity = 100;
		
		int totalVauleOfCart = mul(productPrice, quantity);
		
		return (totalVauleOfCart);
		
	}
}
