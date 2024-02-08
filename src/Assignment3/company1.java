package Assignment3;

public class company1 {
String companyName;
String companyService;
String companyLocation;

//creating a constructor to initialize companyName
public company1(String companyName) {
	this.companyName = companyName;
}
//creating a constructor to initialize companyName and companyService
public company1(String companyName, String companyService) {
	this.companyName = companyName;
	this.companyService = companyService;
}
//creating a constructor to initialize companyName,companyService, and companyLocation
public company1(String companyName, String companyService, String companyLocation) {
	this.companyName = companyName;
	this.companyService = companyService;
	this.companyLocation = companyLocation;
}
}
