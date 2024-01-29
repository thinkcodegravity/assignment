package Method;

public class SimpleInterest {
	// Declaring a variables for simple interest
	double principleP = 500;
	double yearT = 5.5;
	double rateR = 0.5;

	// Creating a method to calculate simple interest rate
	public double simpleInterest() {
		// Creating a reference C to call calculator class to use their calculating
		// functions
		Calculator C = new Calculator();
		double PT = C.mul(principleP, yearT);
		double PTR = C.mul(PT, rateR);
		double SimpleInterest = C.div(PTR, 100);
		System.out.println("The Simple interest of " + principleP + " in " + yearT + " years at the rate of" + rateR
				+ " is $" + SimpleInterest);
		return SimpleInterest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest I = new SimpleInterest();
		I.simpleInterest();

	}

}
