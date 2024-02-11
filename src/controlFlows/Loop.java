package controlFlows;
import java.util.Scanner;


public class Loop {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number");
		int choice = sc.nextInt();
		int a = 1;
		
		
		while (a <=10 ) {
			System.out.println(choice*a);
			a++;
		}
		

	}

}
