package test;

public class GasScientist {

	public static void main(String[] args) {
		
		double n = 10.5;
		double R = 6.5;
		double T = 20.5;
		double V = 3.5;
		
		Calculator calc = new Calculator();
		double step1 = calc.mult(n,R);
		double step2 = calc.mult(step1,T);
		
		double step3 = calc.div(step2, V);
		
		System.out.println("P is: "+step3);
		
			
		

	}

}
