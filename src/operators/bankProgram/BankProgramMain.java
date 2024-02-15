package operators.bankProgram;
import java.util.Scanner;

public class BankProgramMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How much loan do you want?");
		long a = sc.nextLong();
		
		BankProgramMethod bpm = new BankProgramMethod();
		bpm.applyLoan(a);
				

	}

}
