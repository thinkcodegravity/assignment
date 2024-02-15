package Constructor;

import java.util.Date;

public class Payment {
    int creditCardNumber;
    int paypalUserId;
    String paypalPassword;
    Date creditCardExpiry;

    int creditCardSecCode;

    Payment(int creditCardNumber,
            Date creditCardExpiry,
            int creditCardSecCode){
        this.creditCardNumber=creditCardNumber;
        this.creditCardExpiry=creditCardExpiry;
        this.creditCardSecCode=creditCardSecCode;
    }

    Payment(int paypalUserId, String paypalPassword){
        this.paypalUserId=paypalUserId;
        this.paypalPassword=paypalPassword;
    }
}
