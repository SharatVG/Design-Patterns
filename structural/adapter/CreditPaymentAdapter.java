package structural.adapter;

public class CreditPaymentAdapter implements  UPIPayment {

    private CreditPayment creditPayment;

    public  CreditPaymentAdapter(CreditPayment creditPayment){
        this.creditPayment = creditPayment;
    }
    @Override
    public void makePayment(double amout) {
        creditPayment.makePayment(amout);
    }
}
