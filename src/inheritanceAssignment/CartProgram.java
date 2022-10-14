package inheritanceAssignment;
/*
 	Write a program for Cart that inherits from calculator
	Method calculateCart that takes 2 int input product price and quantity and returns total value of cart.. 
	Use parent method multiply.

 */
public class CartProgram extends Calculator{
	
	public float calculateCart(int productPrice, int quantity) {
		float totalValue = mul(productPrice, quantity);
		return totalValue;
	}

	public static void main(String[] args) {
		CartProgram cp = new CartProgram();
		float total = cp.calculateCart(100, 5);
		System.out.println("The total price of the products saved in the cart is : " + total);

	}

}
