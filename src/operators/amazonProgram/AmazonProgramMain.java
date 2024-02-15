package operators.amazonProgram;
import java.util.Scanner;

public class AmazonProgramMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How many items do you want");
		int a = sc.nextInt();
		
		AmazonProgramMethod apm = new AmazonProgramMethod();
		apm.order(a);

	}
}


