package inheritance3;

public class Login implements Ilogin {
	
	public void Register (String userId, String password, String email) {
		System.out.println("This method registers user login and tells whether or not it was successful");
		return;
	}
	
	public void Login (String userId, String password) {
		System.out.println("This method tells whether or not login was successful");
		return;
	}
	
	public void ChangePassword (String userId, String newPassword) {
		System.out.println("This method changes password and tells whether or not it was successful");
		return;
	}

}
