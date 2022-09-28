package control_flow;
/*
 * Write a shopping program that has-a balance, product price
	Create a checkout method that takes orderquantity as input. 
	Calculate total cart price based on quantity input and product price. 
	If total cart prices is less than balance than return success else return failure

 */
public class ShoppingQuestion4 {
	float balance;
	float productPrice;
	
	public void checkOut(int orderQuantity) {
		float totalCartPrice = orderQuantity * productPrice;
		if(totalCartPrice < balance) {
			System.out.println("success");
		}else {
			System.out.println("failure");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
