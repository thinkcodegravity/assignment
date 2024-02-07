package MethodDeclaration;

public class Methods {

    public String payment(int amount, String typeOfPayment){
        return "Payment by" + typeOfPayment +"Successful! For" + amount;
    }

    public String registration(String name, String password) {
        return "Registered Name: " + name + "Password: "+ password;
    }

    public double totalCartValue(Product pro ){
        return pro.getQuantity() * pro.getPrice();

    }

    public float areaOfRectangle(float width,float height){
        return width * height;
    }

    public float simpleInterest(float principle,float rate, float time){
        return (principle * rate * time)/100;
    }

    public float withdraw(float totalBalance, float withdrawAmount){
        return totalBalance - withdrawAmount;
    }
    public float deposit(float totalBalance, float depositAmount){
        return totalBalance - depositAmount;
    }

    public String electricityPlanDetails(int zipCode){
        return "Plan Details!";
    }

    public String insuranceDetails(int age){
        return "Insurance details!";
    }

    public double totalAmount(double productPrice, double discount ){
        return productPrice - productPrice*discount;
    }

    public String profileReturn(int userId,String password){
        return "profileDetails";
    }
}
