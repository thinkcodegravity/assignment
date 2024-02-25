package Controlflow;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int c;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter 1 for Customer Care and 2 for Other Help");
		c =scan.nextInt();
		scan.close();
		CustomerCare CC =new CustomerCare(c);
		CC.output();
	}

}
