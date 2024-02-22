package inheritance3;

public class LoginMain {

	public static void main(String[] args) {
		
		String userId = "sandesholi";
		String password = "abcd1234";
		String email = "sundaesholi@gmail.com";
		String newPassword = "xyz123";
		
		Login l = new Login();
		
		l.Register(userId, newPassword, email);
		
		l.Login(userId, password);
		
		l.ChangePassword(userId, password);
		

	}

}
