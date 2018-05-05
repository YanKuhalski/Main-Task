package classes;

import classes.ItemsForGame.cards.Card;
import classes.ItemsForGame.cards.CardComparator;
import classes.ItemsForGame.Player;
import exeptions.NotEnothCardsExeption;

import java.util.*;


public class Game {
    private List<Player> players = new ArrayList<>();
    private Set<Card> cards=new TreeSet<>(new CardComparator());

    public Game(Collection<Card> cards, int numberOfPlayer) {
       this.cards.addAll(cards);
       for (int i=1;i<numberOfPlayer+1;i++)
       players.add(new Player("player "+i));
    }


    public List<Player> play() {
        Dealer dealer = new Dealer(cards);
       try {
           do {
               for (Player player : players) {
                   player.takeATurn(dealer);
               }
           }
           while (dealer.checkGameStatus());
       } catch (NotEnothCardsExeption notEnothCardsExeption) {
           System.out.println(  notEnothCardsExeption.toString());
       }

        for (Player player : players) {
            dealer.getResults(player);
        }
      return   dealer.showWinner();
    }
}
