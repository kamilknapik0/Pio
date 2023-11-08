import java.util.Scanner;

public class PlayerHuman extends Player {
    private Scanner scan = new Scanner(System.in);

    int number;

    public PlayerHuman() {
    };

    public PlayerHuman(String name) {
        setName(name);
    }

    public int guess() {
        System.out.println("podaj liczbe: ");
        return number = scan.nextInt();
    }
}
