package Assignment2;

public class InterestRate {
	double principle;
	double interestAmount;
	int year;
	double rate;

	public void interestRate(double principle, double interestAmount, int year) {
		 rate=(interestAmount*100)/(principle*year);
		 System.out.println("Your current interest rate is "+rate);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InterestRate cal=new InterestRate();
cal.interestRate(6999.5, 150.5, 2);
	}

}
