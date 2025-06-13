import java.util.Scanner;

public class testchatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for width and height
        System.out.print("Enter width: ");
        int width = scanner.nextInt();

        System.out.print("Enter height: ");
        int height = scanner.nextInt();

        // Character to print
        char fillChar = '*';

        // Loop to print the rectangle
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print(fillChar);
            }
            System.out.println();
        }

        scanner.close();
    }
}
