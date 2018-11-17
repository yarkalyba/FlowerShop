package flowers;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Flower {
    private FlowerType type;
    private Color color;
    private float price;
    private FlowerSpec spec;
    private String country_of_origin;

    public double getSepalLenght() {
        return spec.getSepalLenght();
    }

    public void setSepalLenght(double sepalLenght) {
        spec.setSepalLenght(sepalLenght);
    }
}
