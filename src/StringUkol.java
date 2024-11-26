import java.util.Scanner;

public class StringUkol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte jméno");
        String inputjmeno = sc.nextLine();
        System.out.println("Zadejte prijmeni");
        String inputprijmeni = sc.nextLine();
        String opacnejmeno = new StringBuilder(inputjmeno).reverse().toString();
        String opacneprijmeni = new StringBuilder(inputprijmeni).reverse().toString();
        System.out.println("Výsledek:");
        System.out.println(opacnejmeno.toUpperCase()+" "+opacneprijmeni.toUpperCase());
    }
}
