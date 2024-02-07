package Variable;

public  class PaymentDetails {
    String paymentMethod;
    float paymentAmount;
    float paymentDiscount;

    boolean paymentConfirmation;

    public PaymentDetails(String paymentMethod, float paymentAmount, float paymentDiscount, boolean paymentConfirmation) {
        this.paymentMethod = "Visa";
        this.paymentAmount = 6.6F;
        this.paymentDiscount = 0.15F;
        this.paymentConfirmation = false;
    }

}