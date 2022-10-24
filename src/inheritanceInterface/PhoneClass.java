package inheritanceInterface;

/*
 	Write a program Phone class that implements INotification
	Write the code for all abstract methods (just sysout is fine)

 */
public class PhoneClass implements INotification {

	@Override
	public boolean sendNotification(String message) {
		System.out.println("Phone notification message");
		return false;
	}

}
