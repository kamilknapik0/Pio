import java.util.Random;

class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int liczba;
        int zgadnij;

        do {
            System.out.println("------------------------");
            liczba = rand.nextInt(6) + 1;
            System.out.println("Wylosowane: " + liczba);

            zgadnij = rand.nextInt(6) + 1;
            System.out.println("Gracz: " + liczba);

            if (liczba == zgadnij) {
                System.out.println("Zgadłeś");
            } else {
                System.out.println("Nie zgadłeś");
            }

        } while (liczba != zgadnij);
    }
}