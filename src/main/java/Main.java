import database.DataBase;
import discounts.PromocodeDiscount;
import flowers.*;
import lombok.Data;
import lombok.SneakyThrows;
import payment.Privat24Payment;

import java.io.BufferedWriter;
import java.io.FileWriter;

@Data
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Color myColor = Color.RED;
        System.out.println(myColor);
        System.out.println(myColor.getRgb());
        Flower fl = new Flower(FlowerType.CHARMOMILE, Color.YELLOW, 12, spec);

        FlowerBucket bucket = new FlowerBucket();
//        bucket.addFlower(fl);


        Privat24Payment p24 = new Privat24Payment();
        Order order = new Order();
//        order.addFlowerBucket();
        order = new PromocodeDiscount(order);

        DataBase db1 = DataBase.getInstance();
        db1.add(order);
        db1.commit();

        BufferedWriter file = new BufferedWriter((new FileWriter("my.txt", true)));
        file.write("rybka");
        file.close();

        }
}