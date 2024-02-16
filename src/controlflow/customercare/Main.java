package controlflow.customercare;

import java.util.Scanner;

//Write a method to print “customer care” if input to method is 1 else print “other help”.

public class Main {

	public static void main(String[] args) {
		int a;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter 1 for Customer Care and 2 for Other Help");
		a =scan.nextInt();
		scan.close();
		CustomerCare customerCare =new CustomerCare(a);
		customerCare.output();
	}

}
