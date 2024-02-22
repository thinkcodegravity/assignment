package inheritance3;

public interface Ilogin {
	
	public void Register (String userId, String password, String email);
	public void Login (String userId, String password);
	public void ChangePassword (String userId, String newPassword);

}
