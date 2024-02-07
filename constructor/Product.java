public class Product {

    String name;
    double price;
    int quantity;

    public Product(String n){
        name = n;

    }

    public Product(String n, double p){
        name = n;
        price = p;

    }

    public static void main(String[] args) {
        Product p1 = new Product("Srijana");
        Product p2 = new Product("Srijana", 20000.00);

        
    }
    
}
