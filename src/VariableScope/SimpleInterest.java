package VariableScope;

public class SimpleInterest {

	public double calculateSimpleInterest(double principle, int time, double rate) {
		double interest = (principle * time * rate) / 100;
		return interest;
	}
}
