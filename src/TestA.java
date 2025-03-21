import java.util.Scanner;

public class TestA {
    // 1. Metoda pro převod jednoho čísla na záporné

    public static double makeNegative(double x) {
        // TODO: Implementace
        if (x < 0) {
            return x;
        } else {
            x = x*-1;
            return x;
        }

    }

    // 2. Metoda swap pro pole celých čísel
    public static void swap() {
        // TODO: Implementace
        //swap array with int data type


    }

    // 2. Metoda swap pro pole reálných čísel
    // Zde přetížení metody swap pro práci s double[] arr

    // 3. Metoda, která projde pole a převede všechny prvky na záporné
    public static void makeAllNegative(double[] arr) {
        // TODO: Implementace
        for (int i = 0; i < arr.length; i++) {
            arr[i] = makeNegative(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Napiš kladné číslo");
        System.out.println(makeNegative(sc.nextDouble()));
        double[] array = {1, 7, 15};
        makeAllNegative(array);
    }
}
