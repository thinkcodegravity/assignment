package operators;
//Calculating simple interest with P T R as input and return simple interest. Include local variable that can calculate PTR/100.

import java.util.Scanner;

public class SimpleInterest {
	 float principal;
	 float time;
     float rate;
	public SimpleInterest(float principal, float time, float rate) {
	    this.principal = principal;
		this.time = time;
		this.rate = rate;
	}

	public static void main(String[] args) {
		float i, principal,time,rate;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter principal amount ,time in years and rate in percentage");
			principal =scan.nextFloat();
			time =scan.nextFloat();
			rate =scan.nextFloat();
		}
		SimpleInterest interest =new SimpleInterest(principal,time,rate);
		i =interest.calculateInterest(principal,time,rate); 
		System.out.println("the calcualted simple interest is "+i);
	}
	
	public float calculateInterest(float p, float t, float r) {
		
		float i =(p*t*r)/100;
		return i;
	}
}
