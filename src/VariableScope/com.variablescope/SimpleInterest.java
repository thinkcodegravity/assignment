public class SimpleInterest 
{
    double P;
    double T;
    double R;
    public static double simpleInterest(double P, double T, double R)
    {
        double SI= P*T*R/100;
        return SI;
    }

    public static void main(String args[]) {
		double P = 1000; // Principal amount
        double T = 2;    // Time period
        double R = 5;  

		double SI = simpleInterest(P, T, R); 
        System.out.println("Simple interest is " + SI);
	}
}


