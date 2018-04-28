package classes;

import classes.ItemsForGame.Player;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players = new ArrayList<>();

    public Game addPlayers(Player player) {
        players.add(player);
        return this;
    }

    public void play() {
        Dealer dealer = new Dealer();

        do {
            for (Player player : players) {
                player.takeATurn(dealer);
            }
        }
        while (dealer.checkGameStatus());
        for (Player player : players) {
            dealer.getResults(player);
        }
                dealer.showWinner();
    }
}
