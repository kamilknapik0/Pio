import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        // Player player = new Player();
        PlayerHuman player = new PlayerHuman("Jeff");

        int number;
        int guess;

        do {
            System.out.println("------------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Number: " + number);

            guess = player.guess();
            System.out.println("Gracz " + player.getName() + ": " + guess);

            if (number != guess) {
                System.out.println("Nie zgadłeś");
            }

        } while (number != guess);

        System.out.println("Zgadłeś");
    }
}
