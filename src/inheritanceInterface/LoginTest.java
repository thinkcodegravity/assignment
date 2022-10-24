package inheritanceInterface;

public class LoginTest {

	public static void main(String[] args) {
		Login login = new Login();
		login.register("Shivaraj", "texas321", "texas@gmail.com");
		
		System.out.println("UserName | Password | Email = " + login.registeredUserId + " | " + login.registeredPassword + " | " + login.registeredEmail);
		
		System.out.println("*******************************************************************");
		
		login.login("Shivaraj", "texas321");
		
		
		System.out.println("************************************************************");
		login.changePassword("Shivaraj", "texas123");

	}

}
