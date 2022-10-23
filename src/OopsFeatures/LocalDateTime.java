package OopsFeatures;


//*****************************Display Date/Time******************************************
import java.time.LocalDate; //Import the local date
import java.time.LocalTime;  //Import the local time

public class LocalDateTime {

	public class Main {
		  public static void main(String[] args) {
		    LocalDate myObj = LocalDate.now(); // Create a date object
		    System.out.println(myObj); // Display the current date
		    LocalTime myObj1 = LocalTime.now();
		    System.out.println(myObj1); //Display the current time
		  }
	}
	
}
