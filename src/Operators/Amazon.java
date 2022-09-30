package Operators;

public class Amazon {

	int stock;

	public void order(int orderQuantity) {
		if (orderQuantity < stock) {
			System.out.println("order approved.");
		} else {
			System.out.println("order cancelled. Please enter different quantity.");
		}
	}

}
