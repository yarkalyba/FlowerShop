package packing;

import flowers.Order;

public class PresentPacking extends Packing{
    public PresentPacking(Order order) {
        super(order);
    }

    public boolean process() {
        System.out.println("Lol we are packing here");
        return super.process();
    }
    @Override
    public double getPrice(){
        return 20 + super.getPrice();
    }
}
