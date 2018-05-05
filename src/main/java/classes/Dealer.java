package classes;

import classes.ItemsForGame.cards.Card;
import classes.ItemsForGame.Deck;
import classes.ItemsForGame.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Dealer {
    private Deck deck;
    private int cardInLastRound;
    private List<Player> winners = new ArrayList<>();
    private List<Player> players = new ArrayList<>();

    public Dealer(Set<Card> cardPoints) {
        deck = new Deck(cardPoints);
        cardInLastRound = cardPoints.size();
    }

    public Card giveCard() {
        Card card = null;
        try {
            card = deck.getRandomCard();
        } catch (IndexOutOfBoundsException e) {
        }
        return card;
    }

    public boolean checkGameStatus() {
        if (cardInLastRound == deck.checkStatus())
            return false;
        else {
            cardInLastRound = deck.checkStatus();
            return true;
        }
    }

    public void getResults(Player player) {
        players.add(player);
    }

    private void selectTheWinner() {
        boolean allHaveMore = true;
        for (Player player : players) {
            if (player.getTotalPoints() < 22)
                allHaveMore = false;
        }
        boolean winerIsSelected = false;
        int morepoints = 22;
        int goodpoints = 21;
        while (!winerIsSelected) {
            if (allHaveMore) {
                for (Player player : players) {
                    if (player.getTotalPoints() == morepoints) {
                        winners.add(player);
                        winerIsSelected = true;
                    }
                }
                morepoints++;
            } else {
                for (Player player : players) {
                    if (player.getTotalPoints() == goodpoints) {
                        winners.add(player);
                        winerIsSelected = true;
                    }
                }
                goodpoints--;
            }
        }
    }

    public List<Player> showWinner() {
        selectTheWinner();
        return winners;
    }
}
