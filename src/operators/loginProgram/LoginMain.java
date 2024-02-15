package operators.loginProgram;
import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please ennter your UserId");				
		String a = sc.nextLine();
		
		System.out.println("Please enter your Password");
		String b = sc.nextLine();
		
		LoginMethod lm = new LoginMethod();
		lm.loginCheck (a,b);
		
		
		
	}

}
