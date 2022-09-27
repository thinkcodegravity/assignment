
public class banking {
 address addr = new address();
 
 employees emp = new employees();
 
account acc =  new account();
 
customers cust = new customers();

public class address  {
	
	int houseNumber;
	String streetName;
	String city;
	String state;
	int zipcode;
	
}

public class employees {
	int emplyeeID;
	String firstName;
	String lastName;
	int dateofBirth;
	int socialSecurityNumber;
}

public class account {
	
	int accountNumber;
	String customerfirstName;
	String customerlastName;
	
}

public class customers {
	String customerfirstName;
	String customerlastName;
	
}
}

