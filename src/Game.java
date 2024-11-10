public class Game {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;

        NumberGenerator generator = new NumberGenerator(min, max);
        UserInput input = new UserInput();
        NumberChecker checker = new NumberChecker();

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

                if (result.equals("Ви вгадали!")) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Будь ласка, введіть коректне число.");
            }
        }

        input.close();
    }
}
