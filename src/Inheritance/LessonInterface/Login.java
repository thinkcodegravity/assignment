package Inheritance.LessonInterface;

import java.util.Objects;

public class Login implements ILogin {

    Integer logInUserId;
    String logInPassword;


    @Override
    public String register(Integer userId, String password, String email) {
        if((userId != null) && (password != null) && (email != null)){
            return "Registration Failed!";
        }
        return "Registration Successful!";
    }

    @Override
    public String login(Integer userId, String password) {
        if((Objects.equals(logInUserId, userId)) && Objects.equals(logInPassword, password)){
            return "Login Successful!";
        } else return "Login Failed!";
    }

    @Override
    public String changePassword(Integer userId, String newPassword) {
        if(Objects.equals(logInUserId, userId)){
            return "Password can be changed!";
        } else return "Password cannot be changed!";
    }
}
