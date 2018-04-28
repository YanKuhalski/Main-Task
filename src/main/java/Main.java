package main.java;

import classes.Game;
import classes.ItemsForGame.Player;

public class Main {
    public static void main(String[] args) {
      Game game=new Game();
      game.addPlayers(new Player("Вася"))
              .addPlayers(new Player("Ян"))
              .addPlayers( new Player("Павел"))
              .play();
    }
}
