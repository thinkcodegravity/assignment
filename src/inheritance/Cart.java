package inheritance;
	/*Write a program for Cart that inherits from calculator
	Method calculateCart that takes 2 int input product price and quantity and returns total value of cart.. Use parent method multiply.
	 *
	 */
public class Cart extends Calculator{
	
	public static void main ( String [] args) {
int productPrice=34;
int quantity= 16;

Calculator Cr = new Calculator();

	int TotalValue = Cr.mul(productPrice, quantity);
	
	System.out.println("Total Price: $"  +TotalValue);
	}
}
	
