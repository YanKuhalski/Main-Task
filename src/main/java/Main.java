package main.java;

import classes.Game;
import classes.ItemsForGame.cards.Card;
import classes.ItemsForGame.cards.CardName;
import classes.ItemsForGame.cards.Suits;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(11, Suits.WORMS, CardName.ACE));
        cards.add(new Card(10, Suits.WORMS, CardName.KING));
        cards.add(new Card(10, Suits.CROSSES, CardName.KING));
        cards.add(new Card(10, Suits.TAMBOURINES, CardName.KING));
        cards.add(new Card(10, Suits.PEAK, CardName.KING));
        cards.add(new Card(10, Suits.TAMBOURINES, CardName.QUEEN));
        cards.add(new Card(10, Suits.PEAK, CardName.QUEEN));
        Game game = new Game(cards, 3);
        game.play();
    }
}
