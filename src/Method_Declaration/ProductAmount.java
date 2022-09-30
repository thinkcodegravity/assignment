package Method_Declaration;

public class ProductAmount {

	public double totalAmount(double price, double discountPercentage) {
		double discountPrice = price * discountPercentage;
		double totalPrice = price - discountPrice;
		return totalPrice;
	}
}
