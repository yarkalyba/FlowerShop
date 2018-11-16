package flowers;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public enum Color {
    YELLOW("255,255,0"),
    RED("255, 59, 48"),
    GREEN("76, 217, 100"),
    PURPLE("88, 86, 214"),
    LIGHTBLUE("52, 170, 220");

    private String rgb;

    Color(String rgb) {this.rgb = rgb;}
}