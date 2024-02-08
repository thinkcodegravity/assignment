package inheritance;

public class Cart extends Calculator {
	
	public int calculateCart(int price, int quantity) {
		return super.mul(quantity, quantity);
	}

}
