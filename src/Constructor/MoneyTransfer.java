package Constructor;

public class MoneyTransfer {
    int receiverAccountNumber;
    String receiverPhone;
    String receiverEmail;
    double amount;

    MoneyTransfer(int receiverAccountNumber,
                  double amount){
        this.receiverAccountNumber=receiverAccountNumber;
        this.amount=amount;
    }

    MoneyTransfer(String receiverPhone,double amount){
        this.receiverPhone=receiverPhone;
        this.amount=amount;
    }

    MoneyTransfer(int amount, String receiverEmail){
        this.amount=amount;
        this.receiverEmail=receiverEmail;
    }
}
