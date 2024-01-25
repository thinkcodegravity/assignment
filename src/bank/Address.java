package bank;

public class Address {
	int streetNo;
	String streetName;
	String city;
	String state;
	long zipcode;
	
	public Address(
			int streetNo,
			String streetName, 
			String city, 
			String state,
			long zipcode
		) {
		super();
		this.streetNo = streetNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", streetName=" + streetName + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}
	
	
	
}