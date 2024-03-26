package MethodDeclarationAndReturnStatement;

public class MethodAssign6 {
	double balance=1500;
	public void withdraw(double withdrawAmount) {
		if(withdrawAmount>balance) {
			System.out.println("insufficient funds");
		}
		else {
			System.out.println("withdraw success");
		}
	}

}
