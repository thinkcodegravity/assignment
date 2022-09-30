package method;

public class Calculator {
	int a=5;
	int b=10;
	public void add () {
	int	addision=a+b;
		System.out.println("Addition: " +addision);
	}
	public void sub() {
		int substraction=b-a;
		System.out.println("Substraction: " +substraction);
		
	}
	public void mul() {
		int multiplication=a*b;
		
		System.out.println("Multiplication: "+multiplication);
	}
	public void div() {
		int division = b/a;
		System.out.println("Division: "+division);
	}

	public static void main(String[] args) {
		Calculator ans = new Calculator();
		ans.add();
		ans.sub();
		ans.mul();
		ans.div();
		
				

	}

}
