package inheritanceInterface;


public abstract class GmailV1 implements IRegister, Ilogin, IChangePassword{
	
	public void registerSuccess () {
		
		System.out.println("Registration successful.");
	}
	
	public void registerFailure () {
		
		System.out.println("Registration failed.");
	}
	
	public void loginSuccess () {
		
		System.out.println("Login successful.");
	}
	
	public void loginFailure () {
		
		System.out.println("Login failed.");
	}
	
}
