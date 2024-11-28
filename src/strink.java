import java.util.Scanner;

public class strink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        System.out.println("Zadej větu");
        String veta = sc.nextLine();
        for (int i = 0; i < veta.length(); i++) {
            if(veta.charAt(i) == ' '){
                counter++;
            }
        }
        sc.close();
        System.out.println(counter);
    }
}
