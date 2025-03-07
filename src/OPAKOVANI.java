import java.util.Scanner;

public class OPAKOVANI {
    static Scanner sc = new Scanner(System.in);
    public static int Prikad4 (){
        System.out.println("Napiš číslo které chceš umocnit");
        int cislo = sc.nextInt();
        System.out.println("Napiš exponent");
        int exponent = sc.nextInt();
        int temp = cislo;
        for (int i = 1; i < exponent; i++) {
            cislo = cislo * temp;
        }
        return cislo;

    }
    public static int Prikad5 (){
        int cislo = sc.nextInt();
        for (int i = cislo - 1; i > 0; i--) {
            cislo *= i;
        }
        return cislo;
    }
    public static int Prikad6 (){
        int cislo = sc.nextInt();
        
        return cislo;
    }
    static int fib(int index) {
        if (index == 1 || index == 2) return 1;
        return fib(index - 2) + fib(index - 1);
    }
    public static void main(String[] args) {
        System.out.println(Prikad4());
        System.out.println(Prikad5());
        System.out.println(Prikad6());

        }
    }
}
