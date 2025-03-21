import java.util.ArrayList;
import java.util.Scanner;
//Volenec, Lipert, Vedoucí: Šefl
public class TODOLIST {
    public static void main(String[] args) {
        ArrayList<String> todolist = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            String input = sc.nextLine();
            todolist.add(input);
            if (input.equals("Konec")) {

                break;
            }

        }
        for (int i = 0; i > todolist.size(); i++) {
            System.out.println(todolist.get(i));
        }
    }
}
