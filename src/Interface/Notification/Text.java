package Interface.Notification;

/*
	Write a program Text class that implements INotification
	Write the code for all abstract methods (just sysout is fine)
 */

public class Text implements INotification {

	@Override
	public boolean sendNotification(String message) {
		message = "This is a text message.";
		System.out.println(message);
		return false;
	}

}
