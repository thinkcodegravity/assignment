package controlFlows;
import java.util.Scanner;

public class inputLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("What is your choice?");
		int choice = sc.nextInt();
		
		
		for (int count = 1; count <= choice; count++ ) {
			System.out.println(count);
		}

	}

}
