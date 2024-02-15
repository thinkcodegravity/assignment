package operators.amazonProgram;

public class AmazonProgramMethod {
	
	int stockQuant = 50;
	
		public void order (int a) {
		
		if (a < stockQuant) {
			System.out.println("Order Approved");
		}
		
		else {
			System.out.println("Order Denied");
		}
	}
	

}
