package inheritances;

public class Cart extends Calculator{
	
	public int calculateCart(int productPrice, int quantity) {
		return super.multiply(productPrice, quantity);
	}

}
