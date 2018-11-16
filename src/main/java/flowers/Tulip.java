package flowers;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Tulip extends Flower {
    public Tulip(int price, Color color){
        this.setColor(color);
        this.setPrice(price);

    }
}
