package ControlFlows;
import java.util.Scanner;
public class CountNumbers {
	// Creating a method to count numbers
	public void NumberCount(int number) {
		for (int i = 1; i <= number; i++) {

			System.out.print(+i + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your counting limit?");
		Scanner sc=new Scanner(System.in);
		int CountingLimit=sc.nextInt();
		System.out.println("Counting number as: ");
		CountNumbers c = new CountNumbers();
		c.NumberCount(CountingLimit);
	}

}
