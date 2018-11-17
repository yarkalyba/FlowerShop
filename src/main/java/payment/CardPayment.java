package payment;

public class CardPayment implements Payment {

    @Override
    public boolean process(double price) {
        System.out.println("Paid with Card...");
        return true;
    }
}
