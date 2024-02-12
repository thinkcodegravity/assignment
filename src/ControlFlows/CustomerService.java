package ControlFlows;
import java.util.Scanner;
/*
 * Customer service program is designed to take input as customer option, if option is equal to 1 it will print
 * "Customer Care" else it will print "Other Help".
 */
public class CustomerService {
	
	//Creating method for customer service department
	public void customerHelp(int option) {
		if(option==1) {
			System.out.println("Customer Care");
		}
		else {
			System.out.println("Other Help");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Customer Service Department");
		System.out.println("Please enter 1 for customer care or enter any other number for Other Help");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		CustomerService c =new CustomerService();
		c.customerHelp(choice);

	}

}
