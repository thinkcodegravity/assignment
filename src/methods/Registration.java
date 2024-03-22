package methods;

public class Registration {
	String userName;
	String password;
	public String register(String userName, String password) {
		this.userName = userName;
		this.password = password;
		return "Registered Successfully";
	}
}
