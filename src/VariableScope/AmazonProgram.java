package VariableScope;

public class AmazonProgram {

    public String changePassword(int userId, String password){
        if(password.isEmpty()){
            return "Password not changed!";
        } else return "Password Changed!";
    }
}
