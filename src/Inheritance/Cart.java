package Inheritance;

public class Cart extends Calculator {
	public int productPrice;
	public int quantity;

	public void calculateCart(int productPrice, int quantity) {
		System.out.println("The total value of cart is: $" + this.mul(productPrice, quantity));
	}

	public static void main(String[] args) {
		Cart Calc = new Cart();
		Calc.calculateCart(500, 10);

	}

}
