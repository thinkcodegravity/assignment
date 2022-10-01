package ControlFlows;

/*
	Write a method to print “customer care” if input to method is 1 else print “other help”.
 */

public class CustomerCare {

	public static void main(String[] args) {
		CustomerCare customerCare = new CustomerCare();
		customerCare.customerService(5);
	}

	public void customerService(int userInput) {
		if (userInput == 1) {
			System.out.println("Customer care.");
		} else {
			System.out.println("Other help.");
		}
	}
}
