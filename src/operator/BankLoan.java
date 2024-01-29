package operator;

public class BankLoan {
		public double bankMoney = 2000;
		
		public void applyLoan(double loanAmount) {
			if (loanAmount < bankMoney) {
				System.out.println("Loan Approved");
			}else {
				System.out.println("Loan Denied");
			}
			
		}
		
		public static void main(String[] args) {
			BankLoan obj = new BankLoan();
			obj.applyLoan(100.12);
		}

}
