package inheritance;

 public interface ILogin {
	public void register(String userid, String password, String email);
	public void login(String userid, String password);			
	public void changePassword(String userid, String newPassword);
}
