import java.sql.SQLOutput;

public class cyklobraz {
    public static void main(String[] args) {
        int velikost = 5;
        for (int radek = 0; radek < velikost; radek++) {
            for (int sloupec = 0; sloupec < velikost; sloupec++) {
                if(radek == 0 || radek == 4) {
                    System.out.print("⬜");
                } else {
                    System.out.print("⬛");
                }

            }
            System.out.println("");
        }
    }
}
