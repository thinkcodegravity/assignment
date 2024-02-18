package Interface1;

public abstract interface ILogin {
	
	//Abstract methods
	//Creating Register method that takes input userid and password and email.
	public boolean register(String userId, String Password, String email);
	//Creating Login method that takes input userid and password.
	public boolean login(String userId, String Password);
	//Creating Change password method that takes input userid and newpassword.
	public boolean changePassword(String userId, String newPassword);
	

}
