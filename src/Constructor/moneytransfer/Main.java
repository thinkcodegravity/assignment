package Constructor.moneytransfer;

public class Main {

	public static void main(String[] args) {
		MoneyTransfer transfer1 = new MoneyTransfer(123456789, 1000.0);
        MoneyTransfer transfer2 = new MoneyTransfer("+1234567890", 500.0);
        MoneyTransfer transfer3 = new MoneyTransfer("recipient@example.com", 200.0, true);
        System.out.println("Transfer 1 - Account Number: " + transfer1.receiverAccountNumber + ", Amount: $" + transfer1.amount);
        System.out.println("Transfer 2 - Phone: " + transfer2.receiverPhone + ", Amount: $" + transfer2.amount);
        System.out.println("Transfer 3 - Email: " + transfer3.receiverEmail + ", Amount: $" + transfer3.amount);
    }
}
