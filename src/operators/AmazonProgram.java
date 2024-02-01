package operators;

public class AmazonProgram {
	
	public static void main(String[] args) {
		
	}
	
//	(has-a): Declare global variable stock
	
	int stock;
	
//	Create order method. Based on If order quantity is less than stock print order approved or cancelled.
	
	public String order(int orderQuantity) {
		if(orderQuantity<stock) {
			return "approved";
		}else {
			return "cancelled";
		}
	}


}
