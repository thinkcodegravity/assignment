public class SimpleInterest 
{
    public double calculateSimpleInterest(double P, double T, double R) {
        double simpleInterest = (P * T * R) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        double principal = 1000; 
        double time = 2;         
        double rate = 5; 
        SimpleInterest si = new SimpleInterest();
        double interest = si.calculateSimpleInterest(principal, time, rate);
        System.out.println("Simple Interest: $" + interest);
    }


}
