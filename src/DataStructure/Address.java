package DataStructure;
public class Address {
    String streetName;
    String state;
    String city;
    int zipCode;
    String country;
    int apartmentNumber;

    public Address(String streetName, String state, String city, int zipCode, String country, int apartmentNumber) {
        this.streetName = streetName;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
        this.apartmentNumber = apartmentNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}