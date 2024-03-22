package operators;

public class FinalAmount {
	public double totalFinalAmount(double productPrice, double discount) {
		return productPrice - productPrice*discount;
	}
}
