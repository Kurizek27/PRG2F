import java.util.Scanner;

public class emailukoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cislo1 = sc.nextInt();
        int cislo2 = sc.nextInt();
        System.out.println(cislo1 + " " + cislo2);
        //priklad2
        int sudecislo = sc.nextInt();
        if (sudecislo % 2 == 0) {
            System.out.println("Cislo je sude");
        } else {
            System.out.println("Cislo neni sude");
        }
        //ukol3
        String jmeno = sc.next();
        System.out.println("Vítejte "+jmeno);
    }
}
