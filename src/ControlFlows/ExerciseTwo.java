package ControlFlows;

public class ExerciseTwo {
    int registeredPhone;
    int registeredUserId;
    String registeredPassword;

    public int methodRetrieveId(int phone){
        if(phone == registeredPhone){
            return registeredUserId;
        }
        return 0;
    }

    public String methodRetrievePassword(int userId){
        if(userId == registeredUserId){
            return registeredPassword;
        }
        return "User not registered";
    }
}
