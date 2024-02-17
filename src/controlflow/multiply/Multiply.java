package controlflow.multiply;

public class Multiply {
	int input;
	
	public Multiply(int input) {
		this.input= input;
	}
	
	public void mul() {
		int i=1;
		while(i<=10) {
			int table=input*i;
			System.out.println(+input+"*"+i+" ="+table);
			i++;
		}
	}
}
