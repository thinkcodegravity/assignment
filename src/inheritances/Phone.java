package inheritances;

public class Phone implements INotification{
	
	@Override
	public String sendNotification(String message) {
		if (message.isEmpty()==false) {
			return "Notification has been sent";
		}
		return "Notification could not be sent";
	}

}
