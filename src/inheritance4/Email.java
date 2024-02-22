package inheritance4;

public class Email implements INotification {
	
	public void sendNotificationEmail (String a) {
		System.out.println("This method tells whether or not sending notification on Email ID was successful");
		return;
	}

}
