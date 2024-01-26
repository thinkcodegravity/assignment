package OopsFundamental;

public class Car {
	//Declaring the variables of a car.(car has a...)
	String make="Toyota";
	String model="Corolla";
	long year=2020;
	String color="Silver";
	double price=25000.00;
	int numberOfDoors=4;
	public void carDetails(){
		System.out.println("I bought "+year+" "+make+" "+model+" "+color+" "+numberOfDoors+" doors car for $"+price+".");
		
	}
	//method to start your car
		public void startCar() {
			System.out.println("Press ignition button to start your car.");
		}
		//method to stop your car
		public void stopCar() {
			System.out.println("Press brakes pad to stop your car.");
		}
	public static void main(String[] args) {
		
		Car c=new Car();//creating a reference object c.
 	    c.carDetails();//method calling statement
 	    c.startCar();//calling startCar method
 	    c.stopCar();//calling stopCar method
	}

}
