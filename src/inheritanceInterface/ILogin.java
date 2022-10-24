package inheritanceInterface;
/*
Write a program for ILogin interface.
Create abstract methods.
Register method that return register is success or failure, and takes input userid and password and email.
Login method that return login is success or failure, and takes input userid and password.
Change password method that return change is success or failure, and takes input userid and newpassword.
*/
public interface ILogin {

	public boolean register(String userId, String password, String email);
	
	public boolean login(String userId, String password);
	
	public boolean changePassword(String userId, String newPassword);
}
