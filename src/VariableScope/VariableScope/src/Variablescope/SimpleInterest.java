package Variablescope;

public class SimpleInterest {
	public double simpleInterest(double P,double T,double R) {
		double SI;
		SI = P * T * R / 100;
		return SI;
	}
	public static void main(String args[]) {
		double principle = 1000;
		double time = 2;
		double rate = 2.5;
		SimpleInterest Si = new SimpleInterest();
		double simpleInterest = Si.simpleInterest(principle, time, rate);
		System.out.println("Simple Interest is" +simpleInterest);
		
		 }
}
