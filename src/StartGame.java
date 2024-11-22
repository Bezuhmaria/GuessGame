import checker.NumberChecker;
import generator.NumberGenerator;
import input.ComputerInput;
import input.Input;
import input.UserInput;
import java.util.Scanner;

public class StartGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть тип гравця:");
        System.out.println("1 - Людина");
        System.out.println("2 - Комп'ютер");

        int choice = scanner.nextInt();

        Input playerInput;

        if (choice == 1) {
            playerInput = new UserInput();
        } else if (choice == 2) {
            playerInput = new ComputerInput();
        } else {
            System.out.println("Неправильний вибір. Гра завершена.");
            return;
        }

        new Game(new NumberGenerator(), playerInput, new NumberChecker());
    }
}
