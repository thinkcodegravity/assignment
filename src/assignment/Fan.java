package assignment;

public class Fan {

	public String manufacturer;
	public String color;
	public byte speed;

	public void turnOnFan() {
		System.out.println("Fan is turned on.");
	}

	public void turnOffFan() {
		System.out.println("Fan is turned off.");
	}

	public void increaseSpeed() {
		System.out.println("Fan speed is increased.");
	}

	public void decreaseSpeed() {
		System.out.println("Fan speed is decreased.");
	}
}
