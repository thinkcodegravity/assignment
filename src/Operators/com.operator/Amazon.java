public class Amazon {
    private static int stock = 1000;

    public static void orderTake(int order)
    {
        if(order<stock)
        {
            System.out.println("Approved!");
        }else {
            System.out.println("Please input less than " + stock);
        }
    }
    public static void main(String[] args) {
        int ordered = 1005;
        orderTake(ordered);

     }
}
