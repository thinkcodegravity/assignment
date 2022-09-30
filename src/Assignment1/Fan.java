package Assignment1;

public class Fan {
    String brand;
    String color;
    byte speed;
    boolean initialState;

    public int turnOnFan(boolean initialState){
        if(initialState == false){
            initialState = true;
            return initialState;
        }
        else{
            System.out.println("Fan is already running");
            return initialState;
        }
    }

    public static void main(String[] args){

    }
}
