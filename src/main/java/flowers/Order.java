package flowers;

import delivery.Delivery;
import lombok.Getter;
import lombok.Setter;
import payment.Payment;

import java.util.ArrayList;

public class Order {
    private ArrayList<FlowerBucket> items;
    @Setter
    @Getter
    private Payment payment;
    @Setter
    @Getter
    private Delivery delivery;

    public Order() {
        items = new ArrayList<>();
    }

    public boolean process() {
        boolean status = payment.process(getPrice());
        status = status && delivery.prepare();
        return status;
    }

    public double getPrice() {
        double price = 0;
        for (FlowerBucket bucket : items) {
            price += bucket.getPrice();
        }

        return price;
    }

    public void addFlowerBucker(FlowerBucket fb) {
        items.add(fb);
    }
}


