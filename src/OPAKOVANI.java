//import java.util.Scanner;
//
//public class OPAKOVANI {
//    static Scanner sc = new Scanner(System.in);
//    public static int Priklad4 (){
//        System.out.println("Napiš číslo které chceš umocnit");
//        int cislo = sc.nextInt();
//        System.out.println("Napiš exponent");
//        int exponent = sc.nextInt();
//        int temp = cislo;
//        for (int i = 1; i < exponent; i++) {
//            cislo = cislo * temp;
//        }
//        return cislo;
//
//    }
//    public static int Priklad5 (){
//        int cislo = sc.nextInt();
//        for (int i = cislo - 1; i > 0; i--) {
//            cislo *= i;
//        }
//        return cislo;
//    }
//    static int Priklad6(int index) {
//        if (index == 1 || index == 2) return 1;
//        return Priklad6(index - 2) + Priklad6(index - 1);
//    }
//    public static void main(String[] args) {
//        System.out.println(Priklad4());
//        System.out.println(Priklad5());
//        System.out.println(Priklad6(sc.nextInt()));
//
//        }{
//    }
//            }}
