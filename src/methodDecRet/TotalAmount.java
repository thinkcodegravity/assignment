package methodDecRet;

public class TotalAmount {
	
	public float ta (float price, float discountPercentage ) {
		float totalAmt = price - (price*discountPercentage);
		
		return totalAmt;
	}

}
