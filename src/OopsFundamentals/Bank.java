public class Bank {
    long accountNumber;
    String firstName;
    String lastName;
    String accountType;

    public void withdraw(){
        System.out.println("Cashing out!");
    }
    public void deposit(){
        System.out.println("Cashing In!");
    }

    public void acquiredInterest(){
        System.out.println("Interest!");
    }
}