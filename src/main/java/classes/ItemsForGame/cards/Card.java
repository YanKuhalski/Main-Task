package classes.ItemsForGame.cards;

public class Card {
    private int points;
    private Suits suit;
    private CardName name;

    public Card(int points, Suits suit, CardName name) {
        this.points = points;
        this.suit = suit;
        this.name = name;
    }

    public Card(Card card) {
        this.points = card.getPoints();
        this.suit = card.getSuit();
        this.name = card.getName();
    }

    public int getPoints() {
        return points;
    }

    public Suits getSuit() {
        return suit;
    }

    public CardName getName() {
        return name;
    }
}
