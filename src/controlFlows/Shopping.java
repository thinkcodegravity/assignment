package controlFlows;

public class Shopping {
	
	int balance = 40;
	double productPrice = 12.99;
	
	public static void main(String[] args) {
		
		Shopping shop = new Shopping();
		System.out.println(shop.checkout(4));
		
	}
	
	public boolean checkout(int orderQ) {
		double totalCost = this.productPrice * orderQ;
		if (totalCost<balance) {
			return true;
		}
		return false;
	}

}
