package operators;

import java.util.Scanner;

public class SumOfThree {
	float a,b,c;
	public SumOfThree(float a, float b, float c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public static void main(String[] args) {
		float a,b,c;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter three numbers to calcualte their sum");
		a=scan.nextFloat();
		b=scan.nextFloat();
		c=scan.nextFloat();
		SumOfThree sum =new SumOfThree(a,b,c);
		float value = sum.add(a,b,c);
		System.out.println("The sum of "+a+" "+b+" and "+c+" is "+value);
	}
	public float add(float a, float b, float c) {
		float sum = 0;
		sum=a+b+c;
		return sum;
	}

}
