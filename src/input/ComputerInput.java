package input;

import java.util.Random;

public class ComputerInput implements Input{
    public String getGuess() {
        System.out.print("Комп'ютер вгадує:");
        Random random = new Random();
        int guess = random.nextInt(100 - 1 + 1) + 1;
        System.out.print(" " + guess + " ");
        return String.valueOf(guess);
    }
}
