package classes.ItemsForGame;

import classes.ItemsForGame.cards.Card;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Deck {
    private List<Card> deck = new ArrayList<>();

    public Deck(Collection<Card> cards) {
        for (Card card : cards)
            deck.add(new Card(card));
    }

    public int checkStatus() {
        int numberOfCards = deck.size();
        return numberOfCards;
    }

    public Card getRandomCard() throws IndexOutOfBoundsException {
        int numberOfCard = (int) (Math.random() * deck.size());
        Card card = deck.get(numberOfCard);
        deck.remove(numberOfCard);
        return card;
    }
}
