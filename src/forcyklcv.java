import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class forcyklcv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
//        System.out.println("Ukol 2");
//        System.out.println("Zadej číslo");
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

//        System.out.println("Ukol 3");
//        System.out.println("Zadej číslo");
//        int n = sc.nextInt();
//        long fact = 1;
//        for (int i = n; i > 0; i--) {
//            fact *= i;
//        }
//        System.out.println(fact);

//        System.out.println("Ruleta");
//        int dead = 13;
//        int strela = -1;
//        int pocetSmrti = 0;
//        int pocetHodu = 100_000_000;
//        for (int i = 1; i <= pocetHodu; i++) {
//            strela = rng.nextInt(1,21);
//            if (strela == dead){
//                pocetSmrti++;
//            }
//        }
//        System.out.println("Procenta:"+(pocetSmrti*100)/pocetHodu);

//          int pocetHodu = 1_000_000;
//          int hod = -1;
//          int hlava = 0;
//          int orel = 0;
//        for (int i = 1; i < pocetHodu; i++) {
//            hod = rng.nextInt(1,3);
//            if (hod == 1){
//                hlava++;
//            }
//            else {
//                orel++;
//            }
//
//        }
//        System.out.println("Hlava:"+(hlava*100)/pocetHodu);
//        System.out.println("Orel:"+(orel*100)/pocetHodu);

        int radky = 4;
        int sloupce = 3;
        int x = 1;
        for (int i = 1; i <= radky ; i++) {
            for (int j = 1; j <= sloupce ; j++) {
                System.out.print("\t"+x);
//                \t je tab \n je novy radek
                x++;
            }
            System.out.println();
        }

    }
}
