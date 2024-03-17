public class FinalAmount 
{
    public double finalAmount(double price, double percentage)
    {
          double total = price * percentage/100;
          return total; 
    }

    public static void main(String[] args) {
        double A = 200; 
        double B = 5; 
        FinalAmount a = new FinalAmount(); 
        double Final = a.finalAmount(A, B); 
        System.out.println("Total is: " + Final+ " after discount.");
    }

}
