package controlFlow;

import java.util.Scanner;

public class PrintMenu {
		/*
		 * Write a method to print menu items (use Switch case)
		Display the price for item selected
		1 – Pizza
		2 – Pasta
		Default – salad
		 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		{
		String choice = "Salad";
		switch  (choice) {
		case "1":
			System.out.println("Pizza");
			break;
		case "2":
			System.out.println("Pasta");
			break;
			default:
				System.out.println("Salad");
		}
	
		{

			
			
//			System.out.println(enter 1. for Pizza);
//		System.out.println(enter 2. for Pasta);
		
		}
		}
	}}

