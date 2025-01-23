import java.util.Random;
import java.util.Scanner;

public class MetodyCVDU {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static String nameInput(){
        System.out.print("Zadejte své jméno: ");
        String name = scanner.nextLine();
        System.out.print("Zadejte své příjmení: ");
        String surname = scanner.nextLine();
        return name + " " + surname;
    }
    public static String usernameGeneration(String usernamegen){
        String[] jmenoPrijmeni = usernamegen.split(" ");
        String jmeno = jmenoPrijmeni[0];
        String prijmeni = jmenoPrijmeni[1];
        String username1 = jmeno.toLowerCase().substring(0, Math.min(jmeno.length(), 3));
        String username2 = prijmeni.toLowerCase().substring(0,Math.min(prijmeni.length(), 3));
        String username3 = String.valueOf(random.nextInt(99)+1);
        System.out.println("Navrhované uživatelské jméno: " + username1 + username2 + username3);
        return username1 + username2 + username3;
    }
    public static void usernameCheck(String username){
        if(username.length() > 5){
            System.out.println("Vaše uživatelské jméno je v pořádku.");
        } else {
            System.out.println("Uživatelské jméno je příliš krátké. Přidejte další znak!");
        }
    }
    public static void main(String[] args) {
        usernameCheck(usernameGeneration(nameInput()));
    }
}
