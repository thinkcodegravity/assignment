package operators;

public class Discount {

	
	int totalAmount;
	int discountRate;
	
	public int discoutedAmount(int totalAmount, int disountedRate)  {
		
		int discountAmount = (totalAmount * discountRate/100);
	
	int discountedAmount = totalAmount - discountAmount;
	
	return discountedAmount;
	}
}
