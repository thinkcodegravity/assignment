package OopsFundamentals;

public class Car {

	public String make;
	public String model;
	public String bodyStyle;
	public short year;
	public String color;
	public String engineType;

	public void changeGear(byte gear) {
		System.out.println("Car gear is changed to " + gear);
	}

	public void increaseSpeed(short speed) {
		System.out.println("Car speed is increased by " + speed + " per hour");
	}

	public void decreaseSpeed(short speed) {
		System.out.println("Car speed is decreased by " + speed + " per hour");
	}

}
