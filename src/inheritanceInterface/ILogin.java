package inheritanceInterface;

public interface ILogin {
	
	public boolean register(String userId,String password,String email);
	public boolean login(String enteredUserId,String enteredPassword);
	public boolean changePassword(String userId, String newPassword);

}
