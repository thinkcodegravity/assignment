package ControlFlows;

public class ExerciseThree {
    double balance;
    double productPrice;

    public String checkout(int orderQuantity){
        double totalPrice = orderQuantity * productPrice;
        if(totalPrice < balance){
            return "Success";
        } else return "Failure";
    }

    public void loopMethod(int num){
        int count = 1;
        while(count <= 10){
            System.out.println(num * count);
            count++;
        }
    }

    public void methodNew(int num){
        switch (num) {
            case 1 : System.out.println("Pizza");
            break;
            case 2 : System.out.println("Pasta");
            break;
            default : System.out.println("Salad");
        }
    }



}
