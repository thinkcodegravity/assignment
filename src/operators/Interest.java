package operators;

import java.util.Scanner;

//Calculating simple interest with P T R as input and return simple interest. 
//Include local variable that can calculate PTR/100.

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principal amount (P): ");
		double P = sc.nextDouble();
		System.out.print("Enter the time in years (T): ");
		float T = sc.nextFloat(); 
		System.out.print("Enter the rate of interest per annum (R): ");
		float R = sc.nextFloat(); 
		calculateInterest(P,T,R);
	}
	
	public static void calculateInterest(double pricipalAmt, float years, float rate) {
		
		System.out.println((pricipalAmt * years * rate)/100);
	}

}
