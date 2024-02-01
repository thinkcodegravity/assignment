package operators;

public class FinalAmount {
	
	public double calculateTotalAmount(double productPrice,double discountPercent) {
		double TotalAmount=productPrice*(discountPercent/100);
		return TotalAmount;
	}

}
