package inheritances;

public class Text implements INotification{
	
	@Override
	public String sendNotification(String message) {
		if (message.isEmpty()==false) {
			return "Notification has been sent";
		}
		return "Notification could not be sent";
	}

}
