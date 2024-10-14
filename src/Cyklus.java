import java.util.Random;

public class Cyklus {
    public static void main(String[] args) {
        Random rng = new Random();
        int cislo = 0;
        while (cislo <= 1000) {
            System.out.println(cislo);
            cislo += 2;
        }

        int kostka;
        do {
            kostka = rng.nextInt(1, 7);
            System.out.println(kostka);
        } while(kostka != 6);
    }
}
