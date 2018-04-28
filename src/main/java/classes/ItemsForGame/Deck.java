package classes.ItemsForGame;

import interfaces.CardsPointsInDeck;

import java.util.ArrayList;
import java.util.List;

public class Deck implements CardsPointsInDeck {
    private List<Card> deck = new ArrayList<>();

    public Deck() {
        for (Integer points : cardPoints)
            deck.add(new Card(points));
    }

    public int checkStatus() {
        int numberOfCards = 0;
        for (Card card : deck)
            numberOfCards = numberOfCards + card.getNumberOfCards();
        return numberOfCards;
    }

    public int getRandomCard() throws IndexOutOfBoundsException {
        int points = 0;
        while (points == 0) {
            int numberOfCard = (int) (Math.random() * deck.size());
            points = deck.get(numberOfCard).getCard();
            if (points == 0) {
                deck.remove(numberOfCard);
            }
        }
        return points;
    }
}
