import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public String getGuess() {
        System.out.print("Введіть число або 'вихід' для завершення: ");
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
}
