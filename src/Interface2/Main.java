package Interface2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Test Email notification
        Email email = new Email();
        boolean ENotification=email.sendNotification("Email Notification");
      if(ENotification){
    	  System.out.println("Notification has been sent to an email successfully!");
        }
      else {
    	  System.out.println("Notification failuire");
      }

        // Test Text notification
	Text text = new Text();
	   boolean textNotification=text.sendNotification("Text Notification");
	      if(textNotification){
	    	  System.out.println("Notification has been sent through text successfully!");
	        }
	      else {
	    	  System.out.println("Notification failuire");
	      }
	      // Test Phone notification
	        Phone phone = new Phone();
	        boolean phoneNotification=phone.sendNotification("Phone Call Notification");
	        if(phoneNotification){
	      	  System.out.println("Notification has been sent through phone call successfully!");
	          }
	        else {
	      	  System.out.println("Notification failuire");
	        

	    }

    }
     


}




