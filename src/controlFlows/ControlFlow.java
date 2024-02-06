package controlFlows;

import java.util.*;

public class ControlFlow {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		ControlFlow cFlow = new ControlFlow();
//		cFlow.takeInput(input);
//		cFlow.customerCare(input);
//		cFlow.multiple(input);
		cFlow.menuItems(input);
		
		
		scan.close();
	}
	
	public void menuItems(int menuNo) {
		switch(menuNo) {
		case 1:
			System.out.println("Pizza");
			break;
		case 2:
			System.out.println("Pasta");
			break;
		default:
			System.out.println("Salad");
		}
	}
	
	public void multiple(int n) {
		int m = 1;
		while(m<=10) {
			System.out.printf("%d X %d = %d\n", n, m, n*m);
			m++;
		}
	}
	
	public void takeInput(int input) {
		for (int i=1; i<=input; i++) {
			System.out.println(i);
		}
	}
	
	public void customerCare(int input) {
		if (input == 1) {
			System.out.println("Customer Care");
		}
		System.out.println("Other help");
	}

}
