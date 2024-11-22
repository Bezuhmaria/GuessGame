import checker.NumberChecker;
import generator.Generator;
import input.Input;
import checker.Checker;

public class Game {

    public Game(Generator generator, Input input, Checker checker){
        int min = 1;
        int max = 100;
        int targetNumber = generator.generate();
        System.out.println("Вгадайте число від " + min + " до " + max + ".");

        while (true) {
            String userInput = input.getGuess();

            if (userInput.equalsIgnoreCase("вихід")) {
                System.out.println("Гра завершена.");
                break;
            }

            try {
                int guess = Integer.parseInt(userInput);
                String result = checker.checkGuess(guess, targetNumber);
                System.out.println(result);

                if (result.equals("Вірно!")) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Будь ласка, введіть коректне число.");
            }
        }
    }

}
