### OOPS Fundamentals

Write java class for below example. <br>
List following.FYI :<br>
Has refers to variable/fields/data of a class, Does refers to methods of the class.<br>
1) Product<br>
Has/instance variable : name, price, quantity<br>
Does/methods : buy, sell, negotiate<br>
2) Car<br>
Has/instance variable  : name, model, cc, companyName, color, engine<br>
Does/methods  : drive, startEngine, turnOnOffLights, openDoor, closeDoor<br>
3) Bank<br>
Has/instance variable  : name, dateOfBirth, address, balance, accountNumber, routingNumber, cardDetails, chequeNumber.<br>
Does/methods: hasDepositedMoney, hasWithdrawnMoney, checkBalance, transferMoney.<br>
4) Television<br>
Has/instance variable  : channels, name, model, display, size<br>
Does/methods  : powerOnOff, controlVolume, controlBrightness, controlContrast. <br>
5) Fan<br>
Has/instance variable  : name, model, speed, voltage<br>
Does/methods  : turOnOff, controlSpeed<br>
6) Tree<br>
Has/instance variable  : name, woodType, age, haveFruits.<br>
Does/methods  : produceOxygen, growLeaves, growFruits.<br>


### Variables

All variables should have proper naming convention, java valid name , choose appropriate data types.
Create variable … create separate java programs and include relevant variables below in those programs.
1) to store Social security number.  Just do the declaration. <br> 
    
    String ssn = "123-43-1234";
    
2) To store Product Details. Declare and initialize on same line. <br>

    public class Product {
    	String productName;
    	double price;
    	String expiryDate; 
	}

3) To store last name.. Declare and next line initialize. <br>
    
    String lastName = "Rajkarnikar";

4) To Store customer online status. Just Declare<br>

    boolean isOnline;

5) To store value of pi . Just declare<br>

    float pi = 3.14159265;
    
6) To store customer phone number. Declare and initialize on same line<br>

    Long phoneNumber = 1234567890;
    
7) To store customer credit card details. Just declare<br>

    Long creditCard;
    
8) To store company contact info. Just Declare <br>

    String contactInfo;
    
9) To store height. . Declare and initialize on same line<br>

    double height = 5.2;
    
10) To store employee salary. Declare and next line initialize.

    Long salary;
    salary = 25000;
    
11) To store add 2 cart details. Just Declare

	public class Cart{
		int id;
		ArrayList<Product> items;
	}
	
	Cart cart1 = new Cart(0, [new Product(), new Product()]);
	
    
12) To store payment details. Declare and next line initialize. 

	String creditCard;
	creditCard = "0000 0000 0000 0000";

13) To store bank balance Just Declare 
	
	int bankBalance;
	
14) To store company name Declare and initialize on same line 

	String companyName = "ABC Ltd.";

15) To store bank account number Just Declare 

	long accountNumber;

16) To store shipping address Declare and initialize on same line

	String address = "123 Shipping Address, AB, 12032";
	
