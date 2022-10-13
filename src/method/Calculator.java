package method;

public class Calculator {
	int a;
	int b;
	public void add (int a, int b) {
	int	addision=a+b;
		System.out.println("Addition: " +addision);
	}
	public void sub(int b,int a) {
		int substraction=b-a;
		System.out.println("Substraction: " +substraction);
		
	}
	public void mul(int a, int b) {
		int multiplication=a*b;
		
		System.out.println("Multiplication: "+multiplication);
	}
	public void div(int b, int a) {
		int division = b/a;
		System.out.println("Division: "+division);
	}

	public static void main(String[] args) {
		Calculator ans = new Calculator();
		ans.add(2,5);
		ans.sub(5,3);
		ans.mul(2,3);
		ans.div(6,3);
		
				

	}

}
