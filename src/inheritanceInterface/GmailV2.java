package inheritanceInterface;

public class GmailV2 extends GmailV1 {
	
	public void passwordChangeSuccess () {
		
		System.out.println("Password changed successfully.");
	}
	
	public void passwordChangeFailure () {
		
		System.out.println("Password changed successfully failed.");
	}
}
