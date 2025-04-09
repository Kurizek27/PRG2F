package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards;
    String[] ranks = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] suits = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
    public Deck() {
        this.cards = new ArrayList<>();
        for (String rank : ranks) {
            for (String suit : suits) {
                cards.add(new Card(rank, suit));
            }
        }
    }
    public void shuffle() {
        Collections.shuffle(cards);
    }
    public Card dealCard() {
        Card karta = cards.get(cards.size() - 1);
        cards.remove(cards.size() - 1);
        return karta;
    }
}
