package Operators;

public class Login {
    int userId;
    String userPassword;

    public String loginMethod(int loginId,String loginPassword){
        if((loginId == userId) && (userPassword.equals(loginPassword))){
            return "Login Successful!";
        } else{
            return "Login Failed!";
        }
    }
}
