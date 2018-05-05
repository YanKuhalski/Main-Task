package classes.ItemsForGame.cards;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        if (o1.getName() == o2.getName() && o1.getSuit() == o2.getSuit())
            return 0;
        else
            return 1;

    }
}
