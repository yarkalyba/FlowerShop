import flowers.*;
import payment.*;
import delivery.*;
import lombok.Data;
import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Scanner reader = new Scanner(System.in);
        List<FlowerBucket> alist = new ArrayList<FlowerBucket>();
        alist.add(bucketCharmomile);
        alist.add(bucketRose);
        alist.add(bucketTulip);

        System.out.println("Which buket do you prefer?");
        System.out.println("Type 1 if Charmomile or 2 if Rose or 3 if Tulip:");
        int buk = reader.nextInt();
        System.out.println("Which payment type do you prefer?");
        System.out.println("Type 1 if Visa/Mastercard or 2 if Privat24:");

        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        if(n==1){
            CardPayment payment = new CardPayment();
            payment.process(alist.get(buk - 1).getPrice());
        }else if (n==2){
            Privat24Payment payment = new Privat24Payment();
            payment.process(alist.get(buk - 1).getPrice());
        }
        NovePoshta deliver = new NovePoshta();
        deliver.prepare(alist.get(buk - 1));
    }
}