import java.util.Random;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        System.out.println("Cviceni 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej Číslo");
        int a = sc.nextInt();
        if (a % 5 == 0) {
            System.out.println("Je delitelne 5ti");
        } else {
            System.out.println("Neni delitelne 5ti");
        }
        System.out.println("Cviceni 2");
        Random rng = new Random();
        int b = rng.nextInt(1, 7);
        int c = rng.nextInt(1, 7);
        System.out.println(b);
        System.out.println(c);

        if (b + c >= 10) {
            System.out.println("Vyhral jsi");
        } else {
            if (b == c) {
                System.out.println("Vyhral jsi");
            } else {
                System.out.println("Prohral jsi");
            }
        }
        System.out.println("Cviceni 3");


        System.out.println("Zadej Číslo");
        int d = sc.nextInt();
        if (d > -100 && d < 100) {
            //&& je and
            System.out.println("Cislo spada do intervalu");

        } else {
            System.out.println("Cislo nespada do intervalu");
        }
        System.out.println("Cviceni 3b");
        System.out.println("Zadej Číslo");
        int e = sc.nextInt();
        if (e > -100 && e < 100) {
            System.out.println("Cislo nespada do intervalu");

        } else {
            System.out.println("Cislo spada do intervalu");
        }
        System.out.println("Cviceni 4");
        int vek = sc.nextInt();
        int cena = 20;
        if (vek < 12 || vek > 70) {
            // || je nebo
            System.out.println("Lístek stojí: " + cena * 0.6);
        } else if (vek >= 13 && vek <= 18) {
            System.out.println("Lístek stojí: " + cena * 0.8);
        } else {
            System.out.println("Lístek stojí: " + cena);
        }
        System.out.println("Cviceni 5");
        int m2 = 640;
        int width = sc.nextInt();
        int height = sc.nextInt();
        int budget = sc.nextInt();
        int vysledek = (width * height) * m2;
        if (budget % vysledek == 0) {
            System.out.println("Zakaznik si muze dovolit pozemek");
        } else {
            System.out.println("Zakaznik si nemuze dovolit pozemek");
        }
        // !je negace

    }
}

