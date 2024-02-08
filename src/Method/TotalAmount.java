package Method;

public class TotalAmount {
	String productName = "Iphone";

	public double priceAfterDiscount(double price, double DiscountPercentage) {
		double DiscountAmount = price * (DiscountPercentage / 100);
		double totalAmount = price - DiscountAmount;

		return totalAmount;
	}

}
