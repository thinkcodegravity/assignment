package simpleInterest;

public class InterestMain {

	public static void main(String[] args) {
		
		int P = 10;
		int T = 20;
		int R = 30;

		InterestMethod met = new InterestMethod();
		int step1 = met.mul (P, T, R);
		int step2 = met.div (step1, 100);
		
		System.out.println("Simple Interest is: "+step2);
	}

}
