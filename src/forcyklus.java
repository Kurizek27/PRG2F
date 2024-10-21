public class forcyklus {
    public static void main(String[] args) {
//        /* Vypište všechny násobky pěti  od 1 do 1000 */
//        int max = 1000;
//        int nasobek = 5;
//        for (int i = 0; i <= max; i += nasobek) {
//            System.out.println("i:"+i);
//        }
//
//        /* Vypište všechny čísla od 100 do 0 */
//        for (int i = 100; i >= 0; i--) {
//            System.out.println("i:"+i);
//        }
//
//        /* upravte předchozí příklad tak aby vypisoval 2 mocniny čísel */
//        for (int i = 100; i >= 0; i--) {
//            System.out.println("i:" + Math.pow(i, 2));
//        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i*j);
            }
        }
    }
}
