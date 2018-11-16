package flowers;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Flower {
    private FlowerType type;
    private Color color;
    private float price;
    private FlowerSpec spec;

    public double getSepalLenght() {
        return spec.getSepalLenght();
    }

    public void setSepalLenght(double sepalLenght) {
        spec.setSepalLenght(sepalLenght);
    }
}
