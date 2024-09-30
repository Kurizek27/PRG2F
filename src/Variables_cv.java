import java.util.Scanner;

public class Variables_cv {
    public static void main(String[] args) {
        // připomínka z minulé hodiny

        // Rozdělte datové typy k proměnnám
        // String, boolean, char, int, double


//        type vek = 0;                         // celá čísla v rozsahu cca -2 miliardy až ~2 miliardy
//        type PI = 3.14159d;                   // reálná čísla (s desetinou čárkou)
//        type isTrue = true;                   // pravdivostní hodnota true/false (ano/ne)
//        type bigA = 'A';                      // jeden znak, píše se do ''
//        type name = "Jmeno";                  // textový řetězec (znak/slovo/text), píše se do "";

        /**
         * CV 1
         * Uložte 2 libovolná čísla do 2 proměnných
         * Poté je:
         * Vypište, Přehoďte, Vypište,
         */

        int a = 25;
        int b = 48;
        System.out.println(a);
        System.out.println(b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

        /**
         * CV 2
         * Napište jednoduchou kalkulačku, která bude umět +, -, *, / nad dvěma čísly z množiny R (Reálných čísel).
         * Výsledky vypište na konzoli
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Zadej Číslo 1");
            double cislo1 = scan.nextDouble();
        System.out.println("Zadej operaci");
            char operace = scan.next().charAt(0);
        System.out.println("Zadej Číslo 2");
            double cislo2 = scan.nextDouble();
        switch (operace) {
            case '+':
                System.out.println(cislo1+cislo2);
                break;
            case '-':
                System.out.println(cislo1-cislo2);
                break;
            case '*':
                System.out.println(cislo1*cislo2);
                break;
            case '/':
                System.out.println(cislo1/cislo2);
                break;

        }


        /**
         * CV 3
         * Uložte do proměnné pravdivostního typu, zda součet 3 libovolných malých písmen je větší než 300.
         * Výsledek vypište na konzoli
         */

        boolean isMore;
        int f = (int) 'f';
        int g = (int) 'g';
        int i = (int) 'i';
        isMore = f + g + i > 300;
        System.out.println(isMore);

        /**
         * CV 4
         * Zeptejte se uživatele na jeho, jméno, příjmení, PSČ a rodné číslo
         * Údaje pak uživateli vypište
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej jméno");
            String jmeno = sc.next();
        System.out.println("Zadej příjmení");
            String prijmeni = sc.next();
        System.out.println("Zadej PSČ");
            int psc = sc.nextInt();
        System.out.println("Zadej rodné číslo");
            String rodnecislo = sc.next();
        System.out.println(jmeno);
        System.out.println(prijmeni);
        System.out.println(psc);
        System.out.println(rodnecislo);

    }
}