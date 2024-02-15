package inheritances;

public class Email implements INotification{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String sendNotification(String message) {
		if (message.isEmpty()==false) {
			return "Notification has been sent";
		}
		return "Notification could not be sent";
	}

}
