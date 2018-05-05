package classes.ItemsForGame;

import classes.Dealer;
import classes.ItemsForGame.cards.Card;
import exeptions.NotEnothCardsExeption;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int totalPoints = 0;
    private String name;
    private List<Card> cards = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    private void getCard(Card card) throws NotEnothCardsExeption {
        if (card == null)
            throw new NotEnothCardsExeption("В колоде кончились карты раньше чем все игроки набрали желаемое количество");
        else if (card.getPoints() == 11 && totalPoints > 10)
            cards.add(new Card(1, card.getSuit(), card.getName()));
        else cards.add(card);
    }

    public void takeATurn(Dealer dealer) throws NotEnothCardsExeption {
        if (getTotalPoints() < 16)
            getCard(dealer.giveCard());
    }

    public int getTotalPoints() {
        int points = 0;
        for (Card card : cards) {
            points += card.getPoints();
        }
        return points;
    }


}
