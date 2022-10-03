package operator.second;

public class Amazon {
	int stock;
	public void order(int orderQty) {
		if(stock>orderQty) {
			System.out.println("Order Approved");
		}
		else {
			System.out.println("Order Cancelled");
		}
	}

}
