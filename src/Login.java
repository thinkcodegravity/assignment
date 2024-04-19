package InheritanceAssignmentPPT;

public class Login implements ILogin{
	public Boolean register(String userid ,String password ,String email) {
		System.out.println("Registration is successful!");
		return true;
	}
	public Boolean login(String userid ,String password) {
		System.out.println("Login is successful!");
		return true;
	}
	public Boolean ChangePassword(String userid ,String password) {
		System.out.println("Password is successfully changed!");
		return true;
	}
}
