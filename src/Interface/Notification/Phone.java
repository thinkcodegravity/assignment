package Interface.Notification;

/*
	Write a program Phone class that implements INotification
	Write the code for all abstract methods (just sysout is fine)
 */

public class Phone implements INotification {

	@Override
	public boolean sendNotification(String message) {
		message = "This is a phone notification message.";
		System.out.println(message);
		return false;
	}

}
