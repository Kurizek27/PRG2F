import java.util.Random;
import java.util.Scanner;

public class TestA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        System.out.println("Příklad 1");
        System.out.println("Zadejte hmotnost:");
        int hmotnost = sc.nextInt();
        if (hmotnost < 100) {
            System.out.println("Můžete běžet v závodě");
        } else {
            System.out.println("Nemůžete běžet v závodě");
        }

        System.out.println("Příklad 2");
        int mince1 = rng.nextInt(0, 2);
        int mince2 = rng.nextInt(0, 2);
        int mince3 = rng.nextInt(0, 2);
        System.out.println("Mince 1:" + mince1);
        System.out.println("Mince 2:" + mince2);
        System.out.println("Mince 3:" + mince3);
        if (mince1 + mince2 == 0 || mince2 + mince3 == 0 || mince3 + mince1 == 0) {
            System.out.println("Vyhrál jste");
        } else {
            System.out.println("Prohrál jste");
        }

        System.out.println("Příklad 3");
        System.out.println("Zadejte spotřebu vody");
        int spotreba = sc.nextInt();
        if (spotreba >= 0 && spotreba <= 1000) {
            System.out.println("Cena:" + spotreba * 2);
        } else if (spotreba >= 1001 && spotreba <= 5000) {
            System.out.println("Cena:" + spotreba * 1.8);
        } else if (spotreba >= 5001 && spotreba <= 10000) {
            System.out.println("Cena:" + spotreba * 1.5);
        } else {
            System.out.println("Cena:" + spotreba * 1.2);
        }
    }
}
