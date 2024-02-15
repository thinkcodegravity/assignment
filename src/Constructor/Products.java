package Constructor;

public class Products {
    String name;
    int quantity;
    double price;

    Products(String name){
        this.name = name;

    }

    Products(String name, double price){
        this.name=name;
        this.price=price;
    }

}
