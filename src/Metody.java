import java.util.Random;

public class Metody {

    static void hodKostky(){
        Random rng = new Random();
        int hodkostkou = rng.nextInt(0,6);
        hodkostkou += 1;
        System.out.println("Hodil jsi: "+hodkostkou);}

    static void vypisHlasku(){
        System.out.println("Zadejte číslo od 0 - 10");
    }

    public static void main(String[] args) {
        vypisHlasku();

    }
}
