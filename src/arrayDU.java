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

    static void pridatPolozku(String polozka, char rarita) {
        inventory = Arrays.copyOf(inventory, inventory.length + 1);
        inventory[inventory.length - 1] = polozka;

        rarity = Arrays.copyOf(rarity, rarity.length + 1);
        rarity[rarity.length - 1] = rarita;
    }

    static void seraditAZ() {
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < inventory.length - 1; i++) {
                if (inventory[i].compareTo(inventory[i + 1]) > 0) {
                    String temp = inventory[i];
                    inventory[i] = inventory[i + 1];
                    inventory[i + 1] = temp;

                    char tmp = rarity[i];
                    rarity[i] = rarity[i + 1];
                    rarity[i + 1] = tmp;

                    swap = true;

                }
            }
        } while (swap);
    }

    static void seradaditRare()

    {
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < rarity.length - 1; i++) {
                if (rarity[i] > rarity[i + 1]) {
                    String temp = inventory[i];
                    inventory[i] = inventory[i + 1];
                    inventory[i + 1] = temp;

                    char tmp = rarity[i];
                    rarity[i] = rarity[i + 1];
                    rarity[i + 1] = tmp;

                    swap = true;
                } else if (rarity[i] == rarity[i + 1]) {
                    if (inventory[i].compareTo(inventory[i + 1]) > 0) {
                        String temp = inventory[i];
                        inventory[i] = inventory[i + 1];
                        inventory[i + 1] = temp;

                        char tmp = rarity[i];
                        rarity[i] = rarity[i + 1];
                        rarity[i + 1] = tmp;

                        swap = true;
                    }
                }
            }
        } while (swap);
    }

    public static void main(String[] args) {
        pridatPolozku("Jablicko", 'A');
        pridatPolozku("Hruska", 'C');
        pridatPolozku("Zelenina", 'D');
        pridatPolozku("Pepa", 'B');
        seraditAZ();
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(rarity[i] + " - " + inventory[i]);
        }
        seradaditRare();

        for (int i = 0; i < inventory.length; i++) {
            System.out.println(rarity[i] + " - " + inventory[i]);
        }



    }

}
