package structural.adapter;

public class Main {

    public static void main(String[] args) {
        CreditPayment creditPayment = new CreditPayment();
        UPIPayment upiPayment = new CreditPaymentAdapter(creditPayment);

        upiPayment.makePayment(23943.084);
    }
}
