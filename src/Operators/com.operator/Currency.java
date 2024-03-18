public class Currency {
    private static final double EXCHANGE_RATE = 0.72; 

    public static double convert(double dollars) {
        return dollars * EXCHANGE_RATE;
    }

    public static void main(String[] args) {
        double dollars = 100; 
        double pounds = convert(dollars);
        System.out.println(dollars + " US dollars is equivalent to " + pounds + " UK pounds.");
    }
}
