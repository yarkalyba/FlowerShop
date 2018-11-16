package flowers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlowerBucket {
    public final static double AVERAGE_WEIGHT = 1;
    private ArrayList<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower fl) {
        flowers.add(fl);
    }

    public double getPrice() {
        double price = 0;
        for (Flower flower : flowers) {
            price += flower.getPrice();
        }
        return price;
    }
}
