import checker.NumberChecker;
import generator.NumberGenerator;
import input.UserInput;

public class StartGame {


    public static void main(String[] args) {
        new Game(new NumberGenerator(1, 100),new UserInput(),new NumberChecker());
    }
}
