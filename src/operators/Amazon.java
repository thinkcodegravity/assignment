package operators;

public class Amazon {
	static int stock;
	public String order(int orderQuantity) {
		if(orderQuantity < stock) {
			return "Order Approved";
		}
		else {
			return "Order Cancelled";
		}
	}
}