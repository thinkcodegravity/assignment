package Assignment3_Variables;


public class ShoppingCart {
	  // instance variables
	  private String itemName;
	  private int quantity;
	  private double price;

	  
	  // constructor
	  public ShoppingCart(String itemName, int quantity, double price) {
	    this.itemName = itemName;
	    this.quantity = quantity;
	    this.price = price;
	  }

	  
	  public static void main(String[] args) {
		  // create a ShoppingCart object for the first item
		  ShoppingCart item1 = new ShoppingCart("T-Shirt", 2, 20.0);

		  // print the details of the first item
		  item1.printItemDetails();
		
		  // create a ShoppingCart object for the second item
		  ShoppingCart item2 = new ShoppingCart("Jeans", 1, 50.0);

		  // print the details of the second item
		  item2.printItemDetails();
	  }
	  
	  
	  // getters and setters for the instance variables
	  public String getItemName() {
	    return itemName;
	  }

	  public void setItemName(String itemName) {
	    this.itemName = itemName;
	  }

	  public int getQuantity() {
	    return quantity;
	  }

	  public void setQuantity(int quantity) {
	    this.quantity = quantity;
	  }

	  public double getPrice() {
	    return price;
	  }

	  public void setPrice(double price) {
	    this.price = price;
	  }

	  
	  // method to calculate the total cost of the item
	  public double getTotalCost() {
	    return quantity * price;
	  }

	  // method to print the details of the item
	  public void printItemDetails() {
	    System.out.println("Item: " + itemName);
	    System.out.println("Quantity: " + quantity);
	    System.out.println("Price: $" + price);
	    System.out.println("Total Cost: $" + getTotalCost());
	  }
	}
