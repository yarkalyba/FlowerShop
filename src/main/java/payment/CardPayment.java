package payment;

public class CardPayment implements Payment {
    @Override
    public boolean process() {
        System.out.println("Paid with Card...");
        return true;
    }
}
