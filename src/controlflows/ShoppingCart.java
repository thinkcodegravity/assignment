package controlflows;

public class ShoppingCart {
    private double balance;
    private double price;

    public ShoppingCart(double bal, double pr) {
        balance = bal;
        price = pr;
    }

    public String checkout(int quantity) {
        double total = quantity * price;
        if (total <= balance) {
            return "Success";
        } else {
            return "Failure";
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(100.0, 10.0);
        System.out.println("Checkout with quantity 5: " + cart.checkout(5));
        System.out.println("Checkout with quantity 15: " + cart.checkout(15));
    }
}
