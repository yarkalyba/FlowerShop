import flowers.*;
import lombok.Data;
import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Data
public class Main {
    @SneakyThrows
    public static void main(String[] args) throws IOException {
        FlowerBucket bucketCharmomile = new FlowerBucket();
        FlowerBucket bucketRose = new FlowerBucket();
        FlowerBucket bucketTulip = new FlowerBucket();
        for(int i=0; i<10; i++){
            bucketCharmomile.addFlower(new Flower(FlowerType.CHARMOMILE, Color.YELLOW, 12, new FlowerSpec(), "Ukraine"));
            bucketRose.addFlower(new Flower(FlowerType.ROSE, Color.RED, 20, new FlowerSpec(), "Moldova"));
            bucketTulip.addFlower(new Flower(FlowerType.TULIP, Color.LIGHTBLUE, 15, new FlowerSpec(), "Poland"));
        }
        System.out.println("Charmomile bucket price: "+bucketCharmomile.getPrice());
        System.out.println("Rose bucket price: "+bucketRose.getPrice());
        System.out.println("Tulip bucket price: "+bucketTulip.getPrice());



        }
}