package Assignment2;

public class PrintOneToTen {
	
	//Creating method print
	public void  print() {
		int count=1;
		while(count<=10) {
			System.out.print(" "+count+" ");
			count++;
		}
		
	}
	//main method
	public static void main(String[] args) {
		//Creating an object p
		PrintOneToTen p= new PrintOneToTen();
		p.print();//Method calling statement
		// TODO Auto-generated method stub
		

	}

}
