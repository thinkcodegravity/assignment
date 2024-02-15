package inheritances;

public interface ILogin {
	
	public boolean register(int userId, String password);
	
	public boolean login(int userId, String password);
	
	public boolean changePassword(int userId, String newPassword);

}
