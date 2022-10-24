package inheritanceInterface;

/*
	Write a program Email class that implements INotification
	Write the code for all abstract methods (just sysout is fine)
*/

public class Email implements INotification {

	@Override
	public boolean sendNotification(String message) {
		System.out.println("Email notification message");
		return false;
	}

}
