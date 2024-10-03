import java.util.Random;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        System.out.println("Cviceni 1");
        Scanner scan = new Scanner(System.in);
        System.out.println("Zadej Číslo");
        int a = scan.nextInt();
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
        }
        else {
            if (b == c){
                System.out.println("Vyhral jsi");
            }
            else {System.out.println("Prohral jsi");
            }
        }
        System.out.println("Cviceni 3");

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej Číslo");
        int d = scan.nextInt();
        if (d > -100 && d < 100) {
            System.out.println("Cislo spada do intervalu");
        }
        else {
            System.out.println("Cislo nespada do intervalu");
        }
    }
}

