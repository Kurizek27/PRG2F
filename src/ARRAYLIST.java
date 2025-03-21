import java.util.ArrayList;

public class ARRAYLIST {
    public static void main(String[] args) {
        ArrayList <String> auta = new ArrayList<>();
        auta.add("Škoda");
        auta.add("VW");
        System.out.println(auta.get(1));
        auta.remove(1);
        System.out.println(auta.size());

    }
}
