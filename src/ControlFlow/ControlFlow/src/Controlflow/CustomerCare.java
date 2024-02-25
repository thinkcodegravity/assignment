package Controlflow;

public class CustomerCare {
	int c;
	public CustomerCare(int c){
		this.c = c;
	}
	public void output() {
		if(c==1) {
			System.out.println("Customer Care");
		}
		else {
			System.out.println("Other Help");
		}
	}
}
