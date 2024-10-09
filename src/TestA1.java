import java.util.Random;
import java.util.Scanner;

public class TestA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Oddělení A");
        System.out.println("Příklad 1");
        int vek = sc.nextInt();
        if (vek >= 18 && vek <= 65) {
            System.out.println("Můžeš darovat krev");
        } else {
            System.out.println("Nemůžeš darovat krev");
        }
        System.out.println("Přklad 2");
        Random rng = new Random();
        int random1 = rng.nextInt(1, 13);
        int random2 = rng.nextInt(1, 13);
        System.out.println("Karta 1:" + random1 + "Karta 2:" + random2);
        if (random1 + random2 == 21) {
            System.out.println("Vyhrál jste");
        } else if (random1 + random2 < 10) {
            System.out.println("Vyhrál jste");
        } else {
            System.out.println("Prohrál jste");
        }
        System.out.println("Příklad 3");
        int obednavka = sc.nextInt();
        if (obednavka <= 5) {
            System.out.println("Cena:" + (obednavka * 540));
        } else if (obednavka >= 6 && obednavka <= 10) {
            System.out.println("Cena:" + (obednavka * 540 * 0.9));
        } else if (obednavka >= 11 && obednavka <= 50) {
            System.out.println("Cena:" + (obednavka * 540 * 0.8));
        } else {
            System.out.println("Transakce zamítnuta, pokus o překupnictví");
        }

        System.out.println("Oddělení B");
        System.out.println("Příklad 1");
        int vaha = sc.nextInt();
        if (vaha > 50 && vaha < 170) {
            System.out.println("Můžeš darovat krev");
        } else {
            System.out.println("Nemůžeš darovat krev");
        }
        System.out.println("Příklad 2");
        int kostka1 = rng.nextInt(1, 7);
        int kostka2 = rng.nextInt(1, 7);
        int kostka3 = rng.nextInt(1, 7);
        if (kostka1 == kostka2 || kostka2 == kostka3 || kostka3 == kostka1) {
            System.out.println("Vyhrál jste");
        } else {
            System.out.println("Prohrál jste");
        }
        System.out.println("Příklad 3");
        int spotreba =sc.nextInt();
        if (spotreba >= 0 && spotreba <= 199) {
            System.out.println("Cena za elektřinu:"+spotreba*8);
        } else if (spotreba >= 200 && spotreba <= 399) {
            System.out.println("Cena za elektřinu:"+spotreba*7);
        } else if (spotreba >= 400 && spotreba <= 599) {
            System.out.println("Cena za elektřinu:"+spotreba*6);
        } else {
            System.out.println("Cena za elektřinu:"+spotreba*5);
        }
    }
}
