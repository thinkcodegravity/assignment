package inheritance;
/*
 *   - Write a program for ILogin interface
Create abstract methods.
Register method that return register is success or failure, and takes input userid and password and email
Login method that return login is success or failure, and takes input userid and password
Change password method that return change is success or failure, and takes input userid and newpassword
        - Write a program Login class that implements Ilogin
Write the code for all abstract methods (just sysout is fine)


 */

public interface Ilogin {
	
	

	public void register(String Ruserid, String Rpwd, String email);
	
	public void login(String Loguserid, String Logpwd);
	
	public void Changepwd(String userid, String newpwd);
	
	
	

}
