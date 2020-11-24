import Card.ICharge;

import java.util.ArrayList;

public class OnlineAccount {
    private String name;
    private ArrayList<ICharge> paymentMethods;
    private ArrayList<Double> transactionFees;


    public OnlineAccount(String name) {
        this.name = name;
        this.paymentMethods = new ArrayList<ICharge>();
        this.transactionFees = new ArrayList<Double>();
    }

    public void logTransaction(Double purchaseAmount, int paymentMethodIndex) {

    };
}
