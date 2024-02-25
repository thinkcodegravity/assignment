package operators;

public class Amazon {
	static int stock = 50;
	int orderQuantity;
	public Amazon(int order) {
		this.orderQuantity=order;
	}
	public void Order() {
		if(orderQuantity <= stock) {
			System.out.println("Order is approved");
			}
		else {
			System.out.println("Order Cancelled");
		}
	}

}
