package checker;

public class NumberChecker implements Checker {
    public String checkGuess(int guess, int target) {
        if (guess < target) {
            return "Ваше число менше загаданого.";
        } else if (guess > target) {
            return "Ваше число більше загаданого.";
        } else {
            return "Ви вгадали!";
        }
    }
}