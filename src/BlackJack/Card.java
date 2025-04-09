
package BlackJack;

public class Card {
    String rank;
    String suit;

    public int getValue() {
        return value;
    }

    int value;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
        if (rank.equals("A")) {
            this.value = 11;
        } else if (rank.equals("J") || rank.equals("Q") || rank.equals("K")) {
            this.value = 10;
        } else {
            this.value = Integer.parseInt(rank);
        }
    }
    public void printCard(){
        System.out.println(rank + " " + suit);
    }
}
