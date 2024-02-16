package controlflow.customercare;

public class CustomerCare {
	int a;
	public CustomerCare(int a) {
		this.a=a;
	}
	public void output() {
		if(a==1) {
			System.out.println("Customer Care");
		}else {
			System.out.println("Other Help");
		}
	}
}
