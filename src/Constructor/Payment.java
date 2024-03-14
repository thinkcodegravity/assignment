package Constructor;

public class Payment {
	public long creditCardNumber = 1324242349423421L;
	public String creditCardExpiry = "2024-03-11";
	public int creditCardSecCode = 123;
	public int payPalUserID = 12343;
	public String paypalPassword = "4242";
	
	public Payment(long ccN,String ccE,int cCSC) {
		creditCardNumber = ccN;		
		creditCardExpiry = ccE;
		creditCardSecCode = cCSC;
	}
	public Payment(int id, String pass) {
		payPalUserID = id;
		paypalPassword = pass;
	}
}

