package inheritanceInterface;

/*
 	Write a program Text class that implements INotification
	Write the code for all abstract methods (just sysout is fine)

 */

public class TextClass implements INotification {

	@Override
	public boolean sendNotification(String message) {
		System.out.println("This is the text notification message");
		return false;
	}

}
