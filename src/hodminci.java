import java.util.Random;

public class hodminci {
    public static void main(String[] args) {
        Random rng = new Random();
        boolean mince = rng.nextBoolean();
        if (mince) System.out.println("Orel");
        else System.out.println("Panna");


    }
}

