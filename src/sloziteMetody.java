import java.sql.SQLOutput;
import java.util.Scanner;

public class sloziteMetody {

    static double obvodTelesa() {
        int a = 10;
        int b = 5;
        double vypocet = a * b;
        return vypocet;
    }

    static int nactiCislo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napis cislo: ");
        //stejne jako int = scanner.nextInt;
        return scanner.nextInt();
    }

    static void print(String message) {
        System.out.printf(message);
    }

    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int vstup1 = nactiCislo();
        int vstup2 = nactiCislo();
        System.out.println(vstup1 + vstup2);
        print("lol");
        double vysledek = sum(5.6, 4.2);
    }
}
