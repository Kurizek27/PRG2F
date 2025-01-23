import java.util.Scanner;

public class MetodyCVDU {
    static Scanner sc = new Scanner(System.in);
    public static String nameInput(){
        System.out.print("Zadejte své jméno: ");
        String name = sc.nextLine();
        System.out.print("Zadejte své příjmení: ");
        String surname = sc.nextLine();
        return name + " " + surname;
    }
    public static String usernameGeneration(String username){
        username = username.toLowerCase();
        
    }
    public static void main(String[] args) {
        usernameGeneration(nameInput());
    }
}
