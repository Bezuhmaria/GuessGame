package checker;

public class NumberChecker implements Checker {
    public String checkGuess(int guess, int target) {
        if (guess < target) {
            return "Число менше загаданого.";
        } else if (guess > target) {
            return "Число більше загаданого.";
        } else {
            return "Вірно!";
        }
    }
}