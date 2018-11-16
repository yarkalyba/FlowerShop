package packing;

import flowers.FlowerBucket;
import flowers.Order;


    public class Packing extends Order {
        public Order order;
        public Packing(Order order){
            this.order = order;
        }
        @Override
        public double getPrice(){
            return order.getPrice();
        }

        @Override
        public boolean process(){
            return order.process();
        }

        @Override
        public void addFlowerBucket(FlowerBucket fb){
            order.addFlowerBucket(fb);
    return;
        }
}
