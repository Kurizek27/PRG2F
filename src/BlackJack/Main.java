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
        while (playing) {
            System.out.println("H = Hit, S = End game");
            char choice = scanner.nextLine().charAt(0);
            if (choice == 'H') {
                Card card = deck.dealCard();
                total+=card.getValue();
                myCards.add(deck.dealCard());
                if (total > 21) {
                    System.out.println("You lose!");
                    playing = false;
                } else if (total == 21) {
                    playing = false;
                    System.out.println("You win!");
                }
                total = 0;
                for (Card cardcard : myCards) {
                    cardcard.printCard();
                    total += cardcard.getValue();
                }
                System.out.println(total);
            } else {
                playing = false;
            }
        }
        if (total <= 21) {
            System.out.println("Good game my friend");
        } else {
            System.out.println("You lost!");

        }

        total = 0;
        for (Card card : myCards) {
            card.printCard();
            total += card.getValue();
        }
        System.out.println("Tvůj součet je:" + total);
    }
}
