package classes.ItemsForGame;

import classes.exeptions.NoSuchCardExeption;

public class Card {
    private int numberOfCards = 4;
    private int points;

    public Card(int points) {
        this.points = points;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public int getCard() {
        try {
            if (numberOfCards == 0)
                throw new NoSuchCardExeption();
            numberOfCards--;
            return points;
        } catch (NoSuchCardExeption e) {
            return 0;
        }
    }
}
