package OopsFeatures;



//*******************************Java Class Attributes *****************************
public class Attributes {    //Create class for Attributes(Main)
	
		String fname = "Kamal";
		String lname ="Saru";
		int age =24;


	public static void main(String[] args) {
		Attributes myObj = new Attributes();
		System.out.println("Name : " + myObj.fname + " "+myObj.lname);
		System.out.println("Age : " +myObj.age);
		

	}

}
