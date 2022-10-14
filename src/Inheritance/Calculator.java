package Inheritance;

public class Calculator {

	public int num1;
	public int num2;

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int sub(int num1, int num2) {
		if (num1 > num2) {
			return num1 - num2;
		} else {
			return num2 - num1;
		}
	}

	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	public int div(int num1, int num2) {
		return num1 / num2;
	}

}
