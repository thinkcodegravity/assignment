package operator;

public class Sum {
	
	public int sum(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}
	public static void main(String[] args) {
		Sum s = new Sum();
		int result = s.sum(2, 3, 4);
		System.out.println("Sum of three number is "+result);
	}

}
