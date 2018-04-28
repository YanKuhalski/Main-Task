package classes;

import classes.ItemsForGame.Deck;
import classes.ItemsForGame.Player;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private Deck deck = new Deck();
    private int cardInLastRound = 52;
    private List<Player> winners = new ArrayList<>();
    private List<Player> players = new ArrayList<>();

    public int giveCard() throws IndexOutOfBoundsException {
        int card = deck.getRandomCard();
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
            if (player.getTotalPoint() < 22)
                allHaveMore = false;
        }
        boolean winerIsSelected = false;
        int morepoints = 22;
        int goodpoints = 21;
        while (!winerIsSelected) {
            if (allHaveMore) {
                for (Player player : players) {
                    if (player.getTotalPoint() == morepoints) {
                        winners.add(player);
                        winerIsSelected = true;
                    }
                }
                morepoints++;
            } else {
                for (Player player : players) {
                    if (player.getTotalPoint() == goodpoints) {
                        winners.add(player);
                        winerIsSelected = true;
                    }
                }
                goodpoints--;
            }
        }
    }

    public void showWinner() {
        selectTheWinner();
        if (winners.size() == 1) {
            for (Player winner : winners) {
                System.out.println("ПОБЕДИТЕЛЬ!!!! ");
                winner.showTotal();
            }
        } else {
            System.out.println("Ничья (");
            for (Player winner : winners) {
                winner.showTotal();
            }
        }
    }
}
