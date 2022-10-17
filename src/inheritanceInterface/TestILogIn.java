package inheritanceInterface;

public class TestILogIn {
	
	public static void main(String[] args) {
		
		IRegister ig = new GmailV2();
		ig.registerSuccess();
		
		Ilogin il = new GmailV2();
		il.loginSuccess();
		
		GmailV2 g = new GmailV2 (); // concrete program
		g.passwordChangeSuccess();
		
		}
}
