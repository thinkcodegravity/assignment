package methods;

public class TotalAmount {
	public double totalAmount(double productPrice, double discount) {
		return productPrice - productPrice*discount;
	}
}
