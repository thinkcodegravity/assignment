package Operators;

public class Amazon {
    int stock;

    public void orderMethod(int quantity){
        if(quantity > stock){
            System.out.println("Cancelled!");
        } else System.out.println("Approved!");
    }
}
