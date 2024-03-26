package inheritance;

public class Phone implements INotification {
	
	public void sendNotification(String message) {
		
		if (message.isEmpty()) {
		System.out.println("Call Failed");
		}
		else {
			System.out.println("Phone Notification sent successfully");
		}
	}
}