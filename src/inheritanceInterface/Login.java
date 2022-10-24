package inheritanceInterface;

public class Login implements ILogin {

	String registeredUserId;
	String registeredPassword;
	String registeredEmail;
	
	@Override
	public boolean register(String userId, String password, String email) {
		if(userId != null && password != null && email != null) {
			registeredUserId = userId;
			registeredPassword = password;
			registeredEmail = email;
			System.out.println("Your account has been created successfully");
			return true;
		}else {
			System.out.println("Unble to create an account");
		}
		return false;
	}

	@Override
	public boolean login(String userId, String password) {
		if(userId.equals(registeredUserId)&& password.equals(registeredPassword)) {
			System.out.println(registeredUserId + ", Your account has been logged in successfully");
			return true;
		}else {
			System.out.println("Your user name or password is incorrect ! ");
		}
		return false;
	}

	@Override
	public boolean changePassword(String userId, String newPassword) {
		if(userId.equals(registeredUserId)) {
			newPassword = registeredPassword;
			System.out.println("Your password has been changed");
			return true;
		}else {
			System.out.println("try again later");
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
