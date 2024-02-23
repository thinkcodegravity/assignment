package inheritance.inotification;
//Write a program for INotification interface
//Create abstract methods.
//sendNotification method that return notification is success or failure, and takes input message
//Write a program Email class that implements INotification
//Write the code for all abstract methods (just sysout is fine) 
//Write a program Text class that implements INotification
// Write the code for all abstract methods (just sysout is fine) 
//Write a program Phone class that implements INotification
//Write the code for all abstract methods (just sysout is fine)
public interface Inotification {
	public String sendNotification(String message);
}
class Email implements Inotification {
	public String sendNotification(String message) {
		if(message.equals(null)) {
			return"Email failure";
		}
		return "Email success";
	}
}
class Text implements Inotification{
	public String sendNotification(String message) {
		if(message.equals(null)) {
		return "Text failure";
	}
	return "Text Success";
}
}
class Phone implements Inotification{
	public String sendNotification(String message) {
		if(message.equals(null)) {
		return "Phone failure";
		}
		
		return "Phone Success";
		}
	}