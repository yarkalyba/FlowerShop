package payment;

public class Privat24Payment implements Payment {
    @Override
    public boolean process(double price) {
        System.out.println("Paid with privat 24...");
        return true;
    }
}
