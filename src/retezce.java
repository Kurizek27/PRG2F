import java.util.Scanner;

public class retezce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte slovo");
        String textuzivatele = sc.next();
        char charakter;
        System.out.println(textuzivatele.length());
        for (int swap = 0; swap < textuzivatele.length(); swap++) {
            charakter = textuzivatele.charAt(swap);
            swapped = charakter + swapped;
        }
    }
}
