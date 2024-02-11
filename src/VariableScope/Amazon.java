package VariableScope;
/*
 * Amazon program has method changePassword that takes userid and new password and confirms
 *  if password update was success or failure
 */
public class Amazon {
	String Password;
	
	public boolean ChangePassword(String userId, String newPassword) {
		
	if(newPassword!=Password) {
		System.out.println("Password update Successfully");
		return true;
	}
	else {
		System.out.println("Password update failed");
		return false;
	}
		
	}

}
