package assignment.src;

public class BankingDataStructure {

	/*
	 * Refer java_latest.xlsx for data structure creation process
	 * 
	 * Design Data structure for Banking System. Create programs for each component
	 * of Banking System. Create complex data type programs if needed
	 * 
	 */

	String name;
	long phone;
	Addr address;
	Cus customer;
	
}

class Addr{
	short houseNumber;
	String streetAddress;
	int zipCode;
	String state;
	
}
class Cus{
	String name;
	Addr addressCus;
	Cc creditCardInfo;
	int age;
}
class Cc{
	long number;
	short secCode;
	String expDate;
}