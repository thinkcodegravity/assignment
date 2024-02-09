package Operators;

public class SimpleInterest {

	// Creating a method to calculate SimpleInterest
	public double simpleInterest(double p, int t, double r) {
		// declaring the local variable simpleInterest
		// simple interest formula=(ptr)/100.
		double simpleInterest = (p * t * r) / 100;
		System.out.println(
				"Total Simple Interest of $" + p + " at rate of " + r + "% for" + t + " years is $" + simpleInterest);
		return simpleInterest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reference i is created for the class SimpleInterest
		SimpleInterest i = new SimpleInterest();

		// Passing value p=5000, t=2 years and r=5%
		i.simpleInterest(500, 2, 5);
	}

}
