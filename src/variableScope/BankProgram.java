package variableScope;
import java.util.Scanner;

public class BankProgram {

	public static void main(String[] args) {
		
		float balance = 34.86f;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("How much would you like to withdraw?");
		float withDraw = sc.nextFloat();
		
		float newBalance = balance - withDraw;
		
		System.out.println("New Balance is:"+newBalance);
		
	}

}
