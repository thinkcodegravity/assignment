package ControlFlows;

import java.util.Scanner;

public class interestRate {

	public static void main(String[] args) {
		
		// Calculation of Interest Rate, 
		//Simple interest SI= PTR/100
		// formula for Interest Rate, R= (I*100)/(P*T)
		//PrincipleAmount(P),Interest Amount(I), Time(T) and Interest Rate(R)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount :-$ ");
		double P = sc.nextDouble();
		System.out.println("Enter the Simple Interest Amount :-$ ");
		double I = sc.nextDouble();
		System.out.println("Enter the duration of the loan :- ");
		double T = sc.nextDouble();
		
		//Interest Rate formula
		double R = I*100/P*T;
		System.out.println("The interest Rate of the loan is " + R+"% ");
		

	}

}
