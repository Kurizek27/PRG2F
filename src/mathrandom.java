import java.util.Random;
public class mathrandom {
    public static void main(String[] args) {
        int max = 50;
        int min = 12;
        Random rng = new Random();
        rng.setSeed(69);

        for (int i = 0; i < 10; i++) {
            System.out.println(rng.nextInt(15, 50));
        }
    }
}
