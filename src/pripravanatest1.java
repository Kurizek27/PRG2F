import java.util.Scanner;

public class pripravanatest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String cislo = "123";
//        int c = 53;
//
//        String retezovaReprezentaceCisla = String.valueOf(c);
//        int CiselnaReprezentaceStringu = Integer.parseInt(cislo);


//        System.out.print("Zadejte cislo: ");
//        String radka = sc.nextLine();
//
//        int ciselnaHodnotaRadky = Integer.parseInt(radka);
//        ciselnaHodnotaRadky +=10;
//        System.out.println(ciselnaHodnotaRadky);
//        sc.close()


//        System.out.print("Zadejte vetu: ");
//        String veta = sc.nextLine();
//        String zacatekVety = "Java";
//        String konecVety = "rocks.";
//        System.out.println("Retezec zacina na " + zacatekVety + ": " + veta.startsWith(zacatekVety));
//        System.out.println("Retezec konci na " + konecVety + ": " + veta.endsWith(konecVety));
//        sc.close();


        System.out.print("Zadej vetu: ");
        String vetauzivatele = sc.nextLine();

        System.out.print("Zadej začátek (index): ");
        int zacatek = sc.nextInt();
        System.out.print("Zadej konec (index): ");
        int konec = sc.nextInt();

        System.out.println(vetauzivatele.substring(zacatek, konec));
    }
}