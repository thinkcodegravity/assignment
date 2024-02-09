package com.inheritance;

public class Calculator {
	public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }
    
    public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("The addition:" +calc.add(1, 1));
		System.out.println("The subtraction:" +calc.sub(7, 1));
		System.out.println("The Multiplication:" +calc.mul(2, 2));
		System.out.println("The division:" +calc.div(6, 2));
	}

}
