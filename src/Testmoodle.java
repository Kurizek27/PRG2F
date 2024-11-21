public class Testmoodle {
    public static void main(String[] args) {
        int velikost = 8;
        for (int radek = 0; radek < velikost; radek++) {
            for (int sloupec = 0; sloupec < velikost; sloupec++) {
                if ((radek + sloupec) % 2 == 0) {
                    System.out.print("⬜");
                } else {
                    System.out.print("⬛");
                }
            }
            System.out.println("");
        }
    }
}

