package inheritance;

public class Login implements ILogin {

    private String userid = "";
    private String password = "";
    private String email = "";

    @Override
    public void register(String userid, String password, String email) {
        if (userid.isEmpty() || password.isEmpty() || email.isEmpty()) {
            System.out.println("Please provide valid userid, password, and email");
        } else {
            this.userid = userid;
            this.password = password;
            this.email = email;
            System.out.println("Registration Successful");
        }
    }

    @Override
    public void login(String userid, String password) {
        if (this.userid.isEmpty() || this.password.isEmpty()) {
            System.out.println("You have to register first");
        } else if (this.userid.equals(userid) && this.password.equals(password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }

    @Override
    public void changePassword(String userid, String newPassword) {
        if (this.userid.isEmpty() || this.password.isEmpty()) {
            System.out.println("You have to register first");
        } 
        else if(userid.isEmpty() || newPassword.isEmpty()) {
			System.out.println("Enter both userid and new password\n"); 
		} 
        else if (!this.userid.equals(userid)) {
            System.out.println("Enter valid userid");
        } 
        else if (this.password.equals(newPassword)) {
            System.out.println("This password is already in use. Enter a new password");
        } 
        else {
            this.password = newPassword;
            System.out.println("Password changed Successfully");
        }
    }
}
