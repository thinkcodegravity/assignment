package inheritance;

public class Cart {
	public int calculateCart(int productPrice, int quantity) {
		Calculator c = new Calculator();
		int totalCartValue = c.mul(productPrice, quantity);
		return totalCartValue;
	}
}
