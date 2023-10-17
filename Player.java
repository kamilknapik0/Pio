import java.util.Random;

public class Player {
    private Random brain = new Random();

    public int guess() {
        return brain.nextInt(6) + 1;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Nieprawidłowe imie");
        }

    }
}