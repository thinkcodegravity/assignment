package BasicPrograms;
import java.util.Scanner;

public class AddNumbers {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("enter the first num");
	        int a = scanner.nextInt();

	        System.out.println("enter the second num");
	        int b = scanner.nextInt();

	        int sum = a + b;
	        System.out.println("the sum of " + a + " and " + b + " is:" +sum);

	        scanner.close();
	    }

}

//Here the client can feed input data to the system to get the desired result as per their need