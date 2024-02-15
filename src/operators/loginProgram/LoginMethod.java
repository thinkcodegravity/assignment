package operators.loginProgram;

public class LoginMethod {
	
	String registeredUserId = "sundaesholi";
	String registeredPw = "abcd1234";
	
	public void loginCheck (String a, String b) {
		
		if (a.equals(registeredUserId) && b.equals(registeredPw)) {
			System.out.println("Login Successful");
		}
		
		else {
			System.out.println("Login Failed");
		}
		
	}

}
