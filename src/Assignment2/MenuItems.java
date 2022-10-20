/*
 * this program is designed to show the menu items according to the user choice of option
 * switch condition is used to perform the task and show the menu items
 */
package Assignment2;
import java.util.Scanner;
public class MenuItems {

		//Main method
	public static void main(String[] args) {
		int option;
		
		//Creating scanner object
		Scanner sc=new Scanner(System.in);
		
		//Taking menu option from the user
		System.out.print("Please enter menu options 1 or 2: ");
		option=sc.nextInt();
		//Using Switch loop
		switch(option) {
		//When the user option is 1
		case 1:
			System.out.println("Pizza");
			break;
			//when the user option is 2
		case 2:
			System.out.println("Pasta");
			break;
			
		}
			

	}

}
