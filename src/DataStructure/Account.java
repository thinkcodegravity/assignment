package DataStructure;
public class Account {
    String accountType;
    float interestRate;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }




    public Account(String accountType, float interestRate) {
        this.accountType = accountType;
        this.interestRate = interestRate;
    }
}