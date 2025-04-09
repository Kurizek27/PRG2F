package BlackJack;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffle();
        ArrayList<Card> myCards = new ArrayList<Card>();
        myCards.add(deck.dealCard());
        myCards.add(deck.dealCard());
        int total = 0;
        for (Card card : myCards) {
            card.printCard();
            total += card.getValue();
        }
        System.out.println(total);
        boolean playing = true;
        while(playing) {
            char choice = scanner.nextLine().charAt(0);
            if (choice == 'H') {
                myCards.add(deck.dealCard());
                if (total > 21) {
                    System.out.println("You lose!");
                    playing = false;
            } else {
                playing = false;
            }
            total = 0;
            for (Card card : myCards) {
                card.printCard();
                total += card.getValue();
            }
            System.out.println(total);
        }
        if (total > 21) {
            System.out.println("You lose!");
        } else {
            System.out.println("You win!");
        }
    }
}
