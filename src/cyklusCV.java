import java.util.Objects;
import java.util.Scanner;

public class cyklusCV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Ukol 1");

//        int input;
//        int suma = 0;
//        do {
//            System.out.println("Zadejte číslo:");
//            input = sc.nextInt();
//            suma += input;
//        } while (input != 0);
//        System.out.println("Součet:" + suma);

//        System.out.println("Ukol 2");
//        String vstup;
//        String spravneheslo = "tajneheslo";
//        int pokus = 0;
//        while (pokus != 3) {
//            pokus++;
//            System.out.println("Zadejte heslo:");
//            vstup = sc.next();
//
//            if (spravneheslo.equals(vstup)) {
//                System.out.println("Přístup povolen");
//                return;
//            }
//            System.out.println("Přístup zamítnut");
//        }
        System.out.println("Ukol 3");
        int uzivatel;
        int sudecislo = 0;
        do {
            System.out.println("Zadejte cislo:");
            uzivatel = sc.nextInt();
            if(uzivatel % 2 == 0){
                sudecislo++;
            }
        } while (uzivatel > 0);
        System.out.println("Pocet sudych cisel:"+sudecislo);
    }
}
