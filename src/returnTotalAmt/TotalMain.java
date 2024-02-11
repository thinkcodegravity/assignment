package returnTotalAmt;
import java.util.Scanner;

public class TotalMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Product price");
		int prodPrice = sc.nextInt();
		
		System.out.println("Discount percentage");
		int disPer = sc.nextInt();
		
		TotalMethod met = new TotalMethod();
		float step1 = met.div (disPer, 100);
		float step2 = met.mul (step1, prodPrice);
		float step3 = met.sub (prodPrice, step2);
		
		System.out.println("Total Final Amount is: "+step3);
		

	}

}
