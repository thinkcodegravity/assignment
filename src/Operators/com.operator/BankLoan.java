public class BankLoan {
    private static double bankMoney = 1000.00;
     public static void applyLoan(double loanAmount)
     {
        if(loanAmount<=bankMoney)
        {
            System.out.println("Loan successful!");
        }else {
            System.out.println("Please input less than " + bankMoney);
        }

     }
     public static void main(String[] args) {
        double loan = 1000.00;
       

        applyLoan(loan);

     }
}
