package OopsFundamental;

public class Product {
	//Declaring variables
	String name="Iphone 15 Pro Max"; //complex data type
	double price=1199.99;//primitive data type
	int quantity=1;//primitive data type
	
	//Creating a method to buy
	public void buy() {
		System.out.println("In market " +name+" costs $"+price+" for "+quantity+".");
	}
	
	//Creating a method to sell
	public void sell( String name1, int price2) //Creating local variables
	{
		name1="Samsung";
		price2=700;
		System.out.println("Sell your " +name1+ " for $"+price2+" to buy new "+name+".");
		
	}

	public static void main(String[] args) {
		//creating an object iPhone
		Product iPhone=new Product();
		iPhone.buy();//calling method buy using an object iPhone from main method
		
		System.out.println("**************************************");
		
		//creating an object samsung
		Product samsung=new Product();
		
		samsung.sell("Samsung",700 );
	}
	

}
