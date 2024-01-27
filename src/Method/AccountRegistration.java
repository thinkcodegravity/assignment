package Method;

public class AccountRegistration {
	// Declaring the variables
	String accountName = "Samrat Khatiwada";
	int age = 28;
	String Gender = "Male";
	String email = "abcd@codegravity.com";
	String Password = "qwert1234";
	String phoneNumber = "124356789";

//Creating a method to store basic information of an User
	public String basicInformation() {
		System.out.println("Name: " + accountName);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + Gender);
		System.out.println("User Email: " + email);
		System.out.println("Password: " + Password);
		System.out.println("Phone: " + phoneNumber);
		return null;
	}

	// Creating a method to store address of the account holder
	public String Address() {
		String streetAddress = "1035 harbison blvd";
		int unit = 107;
		String City = "Augusta";
		String state = "SC";
		int zipCode = 76098;
		System.out.println("Address:" + streetAddress + ", Apt " + unit + ", " + City + ", " + state + ", " + zipCode);

		return null;
	}

	public AccountRegistration Register() {

		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountRegistration reg = new AccountRegistration();
		reg.basicInformation();
		reg.Address();
	}

}
