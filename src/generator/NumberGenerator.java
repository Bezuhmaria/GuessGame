package generator;

import java.util.Random;

public class NumberGenerator implements Generator {
    private int min;
    private int max;

    public NumberGenerator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int generate() {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
