package control_flow;

public class ControlFlowTest {
	/*
	 Write a method that takes number as input using for loop
	Print 1 , 2,3 … till the number provided as input 

	 */
	public void numberMethod(int a) {
		for(int i = 1; i <= a; i++) {
			System.out.println(i);
		}
	}
	
	/*
	 * Write a method to print “customer care” if input to method is 1 else print “other help”.
	 */
	int choice = 1;
	public void serviceCenter(int num) {
		if(num==1) {
			System.out.println("customer care");
		}else {
			System.out.println("other help");
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlFlowTest tt = new ControlFlowTest();
		tt.numberMethod(10);
		tt.serviceCenter(2);

	}

}
