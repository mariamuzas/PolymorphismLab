package Card;

import java.util.ArrayList;

public abstract class PaymentCard implements ICharge {

    private int cardNumber;
    private String expiryDate;
    private String customerName;
    private String bankName;
    private int sortCode;
    private ArrayList<Double>charges;

    public PaymentCard(int cardNumber, String expiryDate, String customerName, String bankName, int sortCode) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.customerName = customerName;
        this.bankName = bankName;
        this.sortCode = sortCode;
        this.charges = new ArrayList<Double>();
    }
}
