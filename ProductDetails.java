package Assignment3_Variables;


public class ProductDetails {
	  // instance variables
	  private String name = "";
	  private double price = 0.0;
	  private int quantity = 0;
	  private String description = "";
	  
	  public static void main(String[] args) {
		  ProductDetails p1 = new ProductDetails("Apple", 0.99, 10, "A delicious red fruit");
		  p1.printDetails();
		  ProductDetails p2 = new ProductDetails("iPhone", 1000, 1, "Gift to Humanity from Steve Jobs");
		  p2.printDetails();
		  ProductDetails p3 = new ProductDetails("Android", 1, 0, "An affordable solution to Apple hegemony");
		  p3.printDetails();
		  
	  
	  }


	  // constructor
	  public ProductDetails(String name, double price, int quantity, String description) {
	    this.name = name;
	    this.price = price;
	    this.quantity = quantity;
	    this.description = description;
	  }

	  // getters and setters for the instance variables
	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public double getPrice() {
	    return price;
	  }

	  public void setPrice(double price) {
	    this.price = price;
	  }

	  public int getQuantity() {
	    return quantity;
	  }

	  public void setQuantity(int quantity) {
	    this.quantity = quantity;
	  }

	  public String getDescription() {
	    return description;
	  }

	  public void setDescription(String description) {
	    this.description = description;
	  }

	  // method to print all the product details
	  public void printDetails() {
	    System.out.println("Name: " + name);
	    System.out.println("Price: " + price);
	    System.out.println("Quantity: " + quantity);
	    System.out.println("Description: " + description);
	  }
	}
