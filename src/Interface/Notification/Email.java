package Interface.Notification;

/*
	Write a program Email class that implements INotification
    Write the code for all abstract methods (just sysout is fine)
 */

public class Email implements INotification {

	@Override
	public boolean sendNotification(String message) {
		message = "This is a email notification message.";
		System.out.println(message);
		return false;
	}

}
