package methods;

public class TotalCartValue {
	public double totalPrice(Product product) {
		double total = product.price * product.quantity;
		return total;
	}
	public static void main(String args[]) {
		Product pr = new Product();
		pr.product("iPhone", 999.00, 3);
		TotalCartValue cart = new TotalCartValue();
        System.out.println(cart.totalPrice(pr));
	}
}
