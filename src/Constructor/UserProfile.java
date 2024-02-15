package Constructor;

public class UserProfile {
    int userId;
    String password;
    String email;
    long phone;

    UserProfile(int userId, String password){
        this.userId = userId;
        this.password=password;

    }

    UserProfile(String email,String password){
        this.email=email;
        this.password=password;
    }

    UserProfile(long phone,String password){
        this.phone=phone;
        this.password=password;
    }
}
