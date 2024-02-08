package Assignment3;

public class Company {
String name;
String address;
String email;

public Company(String name, String address, String email) {
	this.name=name;
	this.address=address;
	this.email=email;
}
public void display() {
	System.out.println("Company name:"+name);
	System.out.println("Address:"+address);
	System.out.println("Email:"+email);
}
}

