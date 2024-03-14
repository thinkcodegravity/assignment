package InheritanceHomework;

public class Company {
	public String CompanyName = "ABC";
	public String CompanyService = "Garments";
	public String CompanyLocation = "Dhaka";
	
	public Company(String CompanyName) {
		this.CompanyName = CompanyName;
		System.out.println(this.CompanyName);
	}
	public Company(String CompanyName, String CompanyService) {
		this.CompanyName = CompanyName;
		this.CompanyService = CompanyService;
		System.out.println(CompanyName+' '+CompanyService);

	}
	public Company(String CompanyName, String CompanyService,String CompanyLocation) {
		this.CompanyName = CompanyName;
		this.CompanyService = CompanyService;
		this.CompanyLocation = CompanyLocation;
		System.out.println(CompanyName+' '+CompanyService+' '+CompanyLocation);

	}
}
