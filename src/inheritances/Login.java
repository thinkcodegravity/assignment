package inheritances;

import java.util.*;

public class Login implements ILogin{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		scanner.nextLine();
		String password = scanner.nextLine();
		
		Login login = new Login();
		System.out.println(login.register(user, password));
		System.out.println(login.login(user, password));
		System.out.println(login.register(user, password));
		
		scanner.close();
	}

	@Override
	public boolean register(int userId, String password) {
		if (password != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean login(int userId, String password) {
		if (password != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean changePassword(int userId, String newPassword) {
		if (!newPassword.isEmpty()){
			return true;
		}
		return false;
	}

}
