import java.util.Arrays;

public class arrayDU {
        static String[] inventory = {
                "Spitzhacke",
                "Krankenwagen",
                "Apache-Hubschrauber 3000",
                "Monchhichi",
                "Chihuahua",
                "Gallone Milch",
                "Hubba Bubba",
                "48-Port-Switch",
                "Stiefel",
                "Schwanz eines weißen Wals",
                "DVD-Player",
                "16GB RAM",
                "LGM 30 Minuteman",
                "Lego Ninja Go",
                "Excalibur",
                "50-Meter-Seil",
                "Quanten-Discombobulator",
                "Empfindungsfähiges Gummiente",
                "Unsichtiges Glücks-Frettchen",
                "Zeitreisender Hamster",
                "Kosmische Luftpolsterfolie",
                "Telepathischer Spatel",
                "Interdimensionales Käserad",
                "Verzerrte Lavalampe",
                "Tanzender Kaktus des Chaos",
                "Mystische Fleischkugel",
                "Einhornfürze im Glas",
                "Singender Weltraum-Taco",
                "Antischwerkraft-Banane",
                "Multiversum-Becher",
                "Hellseherischer Toaster",
                "Atom-Schaumbad"
        };
    static char[] rarity = {'C', 'D', 'D', 'D', 'B', 'A', 'D', 'E', 'E', 'E', 'A', 'E', 'D', 'A', 'E', 'D', 'A', 'A', 'D', 'A', 'E', 'D', 'E', 'B', 'C', 'C', 'A', 'B', 'C', 'C', 'E', 'E'};
    static void pridatPolozku(String polozka, char rarita){
        inventory = Arrays.copyOf(inventory, inventory.length);
        inventory[inventory.length-1] = polozka;

        rarity = Arrays.copyOf(rarity, rarity.length);
        rarity[rarity.length-1] = rarita;
    }
    static void seraditAZ(){
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < inventory.length -1; i++) {
                if (inventory[i].compareTo(inventory[i+1]) > 0) {
                    String temp = inventory[i];
                    inventory[i] = inventory[i+1];
                    inventory[i+1] = temp;

                    char tmp = rarity[i];
                    rarity[i] = rarity[i+1];
                    rarity[i+1] = tmp;

                    swap = true;

                }
            }
        } while (swap);
    }
    public static void main(String[] args) {
        pridatPolozku("plozka1", 'A');
        pridatPolozku("plozka2", 'C');
        pridatPolozku("plozka3", 'D');
        pridatPolozku("plozka4", 'B');



    }

}
