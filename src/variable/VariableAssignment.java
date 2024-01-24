package variable;

import java.util.Date;

public class VariableAssignment{

	//	to store Social security number.  Just do the declaration.
	int socialSecurityNumber;

	//	To store Product Details. Declare and initialize on same line
	String productDetails="IPhone 5";
	

	//	To Store customer online status. Just Declare
	boolean customerStatus;
	

	//	To store value of pi . Just declare
	double valueOfPI;
	
	//	To store customer phone number. Declare and initialize on same line
	String customerPhoneNo = "16413224459";
	

	//	To store customer credit card details. Just declare
	CreditCard creditCard;
	

	//	To store company contact info. Just Declare
	ContactInformation contactInformation;
	
	//	To store height. . Declare and initialize on same line
	float height = 10.34f;
	
	//	To store add 2 cart details. Just Declare
	String AddtoCardDetails;
	

	//	To store bank balance Just Declare
	double bankBalance;
	

	//	To store company name Declare and initialize on same line
	String companyName="ABC Corporation";
	
	//	To store bank account number Just Declare
	long bankAccountNumber;
	
	//	To store shipping address Declare and initialize on same line
	String shippingAddress="1000 North, 4th Street, City, State, ZipCode";
	
	
	public static void main(String args[]) {

		//To store last name.. Declare and next line initialize.
		String lastName;
		lastName="Hossan";

		//To store employee salary. Declare and next line initialize.
		double employeeSalary;
		employeeSalary = 1200;
		
//		To store payment details. Declare and next line initialize.
		String paymentDetails;
		paymentDetails="32333, 01/24, 550";
		
	}
	
	class CreditCard{
		Long cardNumber;
		String cardHolder;
		Date expireDate;
	}
	
	class ContactInformation{
		String address;
		String street;
		String city;
		String state;
		int zipCode;
	}
	
	
}