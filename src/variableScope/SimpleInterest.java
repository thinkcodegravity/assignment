package variableScope;

public class SimpleInterest {
	
	public double simpleInterest(double p, double t, double r) {
		
		double SI = p*t*r/100;
		return SI;
	}
	
	public static void main(String[] args) {
		
		double principal = 4000;
		double time = 2;
		double rate = 3.2;
		SimpleInterest si = new SimpleInterest();
		
		double simpleInterest = si.simpleInterest(principal, time, rate);
		System.out.println("Simple Interest is "+ simpleInterest);
		
	}
	

}
