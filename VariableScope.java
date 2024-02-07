
public class VariableScope {

	public class Car {
		private String vin;
	    private String transportationType;
	}
    
    
    public class Product {
        // Instance variables
        private int quantity;
        private String name;
        private double price;
    }
    
    public class Bank {
        public void withdraw(double withdrawAmount) {
        }
    }
    
    public int calculateSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    
    public double calculateSimpleInterest(double principal, double rate, int time) {
        double interestRate = rate / 100.0;
        return (principal * interestRate * time);
    }
    
    public double calculateSquareArea(double side) {
        double area = side * side;
        return area;
    }
    
    public class ChaseBankAccount {
        private String bankName;
        private String customerNames;
        private double balance;
    }
    
    public class AmazonProgram {
        public boolean changePassword(String userId, String newPassword) {
            return true; 
        }
    }

    private int age;
    
    public double calculateCircleArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
	
}
