package generator;

import java.util.Random;

public class NumberGenerator implements Generator {
    private int min;
    private int max;

    public NumberGenerator() {
        this.min = 1;
        this.max = 100;
    }

    public int generate() {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
