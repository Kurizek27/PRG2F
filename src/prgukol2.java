import java.util.Scanner;

public class prgukol2 {
    static void validatePassword(String password) {
        boolean hasUppercase = password.matches(".*[A-Z].*");
        if (password.length() < 8) {
            System.out.println("Heslo nesplňuje jednu z podmínek: \"délka\"");
        } else if (password.contains("heslo")) {
            System.out.println("Heslo nesplňuje jednu z podmínek: \"obsahuje zakázané slovo\"");
        } else if (!(hasUppercase)) {
            System.out.println("Heslo nesplňuje jednu z podmínek: \"Heslo neobshahuje alespoň jedno velké písmeno\"");
        } else System.out.println("Heslo je v pořádku");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vytvořte si heslo");
        String password = sc.nextLine();
        validatePassword(password);
        
    }
}
