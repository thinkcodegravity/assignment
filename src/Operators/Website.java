package Operators;

public class Website {
    int existingUserId;

    public void register(int userId, String password){
        if(existingUserId == userId){
            System.out.println("Registration Successful!");
        } else System.out.println("Registration Failure!");
    }
}
