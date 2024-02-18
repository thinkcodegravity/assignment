package Interface1;
//implementing the variable and methods available on ILogin to class Login
public class Login implements ILogin{
	String registeredUserId="Sandesh24";
	String registeredEmail="Sandesh@gmail.com";
	String registeredPassword="qwert1234";
	@Override //complete method
	public boolean register(String userId, String Password, String email){
		System.out.println("Account registered successfully");
		return true;
	}
	@Override //complete method
	public boolean login(String userId, String Password) {
		if(registeredUserId.equals(userId)&&registeredPassword.equals(Password)) {
		
		System.out.println("Login Successfully");
		
		}
		else {
			System.out.println("Invalid username or Password. Please try again");
		}
		return true;
	}
	@Override //complete method
	public boolean changePassword(String userId, String newPassword) {
		if(registeredUserId.equals(userId)&& !registeredPassword.equals(newPassword)) {
		System.out.println("Password changed successfully");
		return true;
		}
		else {
			if(registeredPassword.equals(newPassword)) {
			System.out.println("New password must be different than your current password");
			}
			else {
				System.out.println("Account can not find");
			}
			
		}
		return false;
		
	}


}
