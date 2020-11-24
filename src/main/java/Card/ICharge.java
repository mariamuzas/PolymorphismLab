package Card;

public interface ICharge {
    Double voidCharge(Double purchaseAmount);
    Double getTransactionFee(Double purchaseAmount);
}
