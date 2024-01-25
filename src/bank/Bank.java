package bank;

import java.util.*;

public class Bank {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		Address address1 = new Address(123, "Java Street", "Oracle", "State", 12345);
		
		Customer customer1 = new Customer(
				1,
				"John",
				"Doe",
				"01/01/2000",
				"+10123456789",
				"john.doe@test.com",
				address1,
				null
			);
		
		String fName = customer1.getFirstName();
		String lName = customer1.getLastName();
		String fullName = fName + " " + lName;
		
		CardDetails cardDetails = new CardDetails(
				1,
				fullName,
				"09/29",
				CardType.DEBIT,
				123
			);
		
		AccountDetails details1 = new AccountDetails(
				000001,
				AccountType.CHECKING,
				4,
				100,
				cardDetails
			);
		
		customer1.setAccountDetails(details1);
		
		System.out.println("Please enter your account number.");
		long accountNumber = scan.nextLong();
		System.out.println("\n");

		if (details1.accountNumber == accountNumber) {
			System.out.println("What would you like to do? Enter number.");
			System.out.println("1. Check Balance \n2. Deposit \n3. Withdraw");
			System.out.println("\n");
			System.out.println("To exit enter 0");
			int action = scan.nextInt();
			System.out.println("\n");
			
			switch(action) {
			case 0:
				System.exit(action);
				break;
			case 1:
				String output = checkBalance(details1.bankBalance);
				System.out.println(output);
				break;
			case 2:
				float newBalance = addBalance(details1.bankBalance);
				details1.setBankBalance(newBalance);
				System.out.printf("Your new bank balance is $%.2f", newBalance);
				break;
			case 3:
				float balance = withdrawMoney(details1.bankBalance);
				details1.setBankBalance(balance);
				System.out.printf("Your new balance is $%.2f\n", balance);
				break;
			default:
				System.out.println("Thank you for choosing us.");
				System.exit(0);
			}
		} else {
			System.out.println("Failed to verify account number");
		}
	}
	
	public static String checkBalance(float balance) {
		String output = String.format("Your balance is $%.2f", balance);
		return output;
	}
	
	public static float addBalance(float balance) {
		System.out.println("How much would like to deposit?");
		float amount = scan.nextFloat();
		System.out.println("\n");
		float newBalance = amount + balance;
		return newBalance;
	}
	
	public static float withdrawMoney(float balance) {
		System.out.println("Please enter amount in multiple of 5.");
		float withdrawlAmount = scan.nextFloat();
		System.out.println("\n");
		
		float newBalance = balance - withdrawlAmount;
		return newBalance;
	}

}