/*
 * This program is designed to create method to register Ecommerce account
 * also create a method to login on your profile
 */

package method;

public class Ecommerce {
	//Declaring variables
	String userName;
	String userPassword;
	long phoneNumber;
	String emailAddress;
	
	//Method creation to register user account
	public void idRegister(String a, String b, long c) {
		this.emailAddress=a;
		this.userName=b;
		this.phoneNumber= c;
		//Display the output if the information are correct
		if(emailAddress=="sk@gmail.com"& userName=="SK"& phoneNumber==12345) {
			System.out.println("You have sucessfully registered your Ecommerce account.");	
		}
		//If the input user informations are not true.; It will not register.
		else {
			System.out.println("Sorry! Please Check your personal information to register.");
		}
	}
	//Method to login into user profile
	public void login(String userName, String userPassword) {

		if(userName=="SK" & userPassword=="abcd") {
			System.out.println("You Sucessfully logged in!");
		}
		else {
			System.out.println("Not able to login. Please try again!");
		}
		
	}

	String productName;
	int productQuantity;
	
	//Creating method to add an items on a cart
	public void addCart(int productQuantity, String productName) {
		if(productQuantity > 0) {
			
			System.out.println(productQuantity+" "+productName+" added to your cart");
		}
		else {
			System.out.println("Please select product and add to your cart.");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Welcome to Ecommerce Online Portal");
		Ecommerce profile = new Ecommerce();
		profile.idRegister("sk@gmail.com","SK",12345);
		profile.login("SK", "abcd");
		
		
		Ecommerce add=new Ecommerce();
		add.addCart(1,"Cloth"); //calling method addCart with its value
		
		
	}

}
