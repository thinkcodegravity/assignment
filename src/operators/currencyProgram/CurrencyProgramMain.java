package operators.currencyProgram;
import java.util.Scanner;

public class CurrencyProgramMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter dollar amount to convert");
		
		float a  = sc.nextFloat();
		
		CurrencyProgramMethod cpm = new CurrencyProgramMethod();
		float b = cpm.prod(a);
		
		System.out.println("The equivalent pount amount is "+b);

	}

}
