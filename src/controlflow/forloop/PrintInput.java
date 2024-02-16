package controlflow.forloop;

//– Write a method that takes number as input using for loop 
//• Print 1 , 2,3 ... till the number provided as input

public class PrintInput {
	int n;
	public PrintInput(int n) {
		this.n=n;
	}
	public void print() {
		for(int i =1; i<=n; i++) {
			System.out.print(" "+i);
		}
	}
	
}
