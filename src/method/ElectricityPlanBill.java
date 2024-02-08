package method;

public class ElectricityPlanBill {
	
	
	
	//– Create a method that can return electricity plan details if provided zip code as the input
	
	
	
	public void planBill(int zipCode) {
		int num1=1;
		int num2=2;
		if(num1==1) {
			System.out.println("TXU Elcectricity plan Details");
			float pricePerKwh=0.14f;
			System.out.println(pricePerKwh+"/ea for zipcode"+zipCode);
			
		}else if(num2==2) {
			System.out.println("Mexico Elcectricity plan Details");
			float dayPricePerKwh=0.139f;
			float nightPricePerKwh= 0.10f;
			System.out.println(dayPricePerKwh+"/ea at daytime and "+nightPricePerKwh+"/ea for nighttime for zipcode "+zipCode);
			
		}
	}
}
