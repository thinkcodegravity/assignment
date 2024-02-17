package controlflow.shopping;

public class Shopping {
	private float balance;
	float productPrice;
	public Shopping(float balance, float productPrice) {
		this.balance =balance;
		this.productPrice =productPrice;
	}
	public float checkOut(int n) {
		float total,remainder;
		total =n*productPrice;
		
		if(total <=balance) {
			remainder =balance-total;
			System.out.println("Success");
			return remainder;
		}else {
			System.out.println("failure");
			return remainder = balance;
		}
	}
}