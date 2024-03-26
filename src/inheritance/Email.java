package inheritance;

public class Email implements INotification {
	
	public void sendNotification(String message) {
		
		if (message.isEmpty()) {
		System.out.println("Email failed");
		}
		else {
			System.out.println("Email notification sent successfully");
		}
	}
}