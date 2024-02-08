package controlflows;

public class ControlFlows {
	
	
	public static void printNumbers(int limit) {
		for(int i=1; i<=limit;i++) {
			System.out.println(i);
		}
		
	} 

	public static void printHelp(int input) {
        if (input == 1) {
            System.out.println("customer care");
        } else {
            System.out.println("other help");
        }
    }

	public static void printMultiples(int number) {
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " * " + i + " = " + (number * i));
            i++;
        }
    }

	public static void printMenu(int choice) {
        double price;
        switch (choice) {
            case 1:
                System.out.println("1 - Pizza");
                price = 10.99;
                System.out.println("Price: $" + price);
                break;
            case 2:
                System.out.println("2 - Pasta");
                price = 8.99;
                System.out.println("Price: $" + price);
                break;
            default:
                System.out.println("Default - Salad");
                price = 6.99;
                System.out.println("Price: $" + price);
        }
    }
}
