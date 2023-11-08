import java.util.Random;

public class Player {
    private Random brain = new Random();

    private String name = "User";

    public Player() {
    } // przeciazenie

    public Player(String name) {
        setName(name);
    }

    public int guess() {
        return brain.nextInt(6) + 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Nieprawidłowe imie");
        }

    }
}
