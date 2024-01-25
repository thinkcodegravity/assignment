package oopsfundamentals;

//1) Product
class Product {
 
 private String name;
 private double price;
 private int quantity;

 public void buy() {}

 public void sell() {}

 public void negotiate() {}
 
 
 public static void main(String[] args) {
	 Car c1 = new Car();
	 Tree t1 = new Tree();
	 System.out.println(c1.make); 
	 System.out.println(t1.height); 

	 System.out.println("hello");
 }
}


class Car {
	String model="Corolla";
	String make="Toyota";
	int year=2012;
	
 // Has : model, make, year
 // Does : start, stop, drive
}

class Bank {
 // Has variables: name, location, accounts,
 // Does : openAccount, closeAccount, transfer
}

class Television {
 // Has : brand, size, resolution
 // Does: turnOn, turnOff, changeChannel
}


class Fan {
 // Has: brand, speed, direction
 // Does: turnOn, turnOff, changeSpeed
}


class Tree {
	
	// Has: type, height, age
	// Does: grow, shedLeaves, reproduce

	String type="Banyan";
	short height=13;
	short age=12;
	
}


