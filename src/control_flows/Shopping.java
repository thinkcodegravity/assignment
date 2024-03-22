package control_flows;

public class Shopping {
	static double balance, productPrice;
	public String checkout(int orderQuantity) {
		double totalCartPrice = orderQuantity * productPrice;
		if (totalCartPrice < balance) {
			return "Success";
		}
		else {
			return "Failure";
		}
	}
}
