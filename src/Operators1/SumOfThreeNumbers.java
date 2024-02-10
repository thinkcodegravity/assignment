package Operators1;

public class SumOfThreeNumbers {
	// Creating a method AddNumbers to get sum of three numbers

	public int AddNumbers(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Sum: "+sum);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfThreeNumbers s = new SumOfThreeNumbers();
		s.AddNumbers(5, 10, 15);
	}

}
