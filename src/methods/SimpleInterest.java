package methods;

public class SimpleInterest {
	public double getInterest(double principalAmount, double interestRate, int time) {
		return (principalAmount * interestRate * time)/100;
	}
} 