package operators;

public class CalculateSum {
	public int Sum(int a,int b,int c) {
		int sum = a + b + c;
		return sum;
	}
	public static void main(String main[]) {
		 CalculateSum S = new CalculateSum();
		 int result = S.Sum(3,4,5);
		 System.out.println("Sum of three numbers is" +result);
		 
		 
	}
}
