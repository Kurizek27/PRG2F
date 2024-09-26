import java.util.Random;
import java.util.Scanner;

public class mathrandom {
    public static void main(String[] args) {
  /*    int max = 50;
        int min = 12;
        Random rng = new Random();
        rng.setSeed(69);

        for (int i = 0; i < 10; i++) {
            System.out.println(rng.nextInt(15, 50));
        }
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej nejmenší číslo");
        int x = sc.nextInt();
        System.out.println("Zadej největší číslo");
        int y = sc.nextInt();
        Random rng = new Random();
        System.out.println(rng.nextInt(x, y));
    }
}
