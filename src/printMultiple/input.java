package printMultiple;

import java.util.Scanner;

public class input{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		print p=new print();
		p.multiple(num);
	}

}
