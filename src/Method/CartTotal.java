package Method;

public class CartTotal {
	// Declaring Variables
	String productName = "Iphone15";
	double totalCost;
	// Creating a method that can take product input to give total cart cost
	//
	public double totalCartValue(int quantity, double price) {
		totalCost = quantity * price;
		System.out.println("Your Cart total for " + quantity + " " + productName + " is $" + totalCost);
		return totalCost;

	}

	public static void main(String[] args) {
		CartTotal cost = new CartTotal();
		cost.totalCartValue(5, 1199.00);
	}
}
