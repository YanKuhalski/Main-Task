package classes.ItemsForGame;

import  classes.Dealer;

public class Player {
    private int totalPoints = 0;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    private void getCard(int points) {
        if (points == 11 && totalPoints > 10)
            points = 1;
        totalPoints = totalPoints + points;
    }

    public void takeATurn(Dealer dealer) {
        if (totalPoints < 16)
            getCard(dealer.giveCard());
    }

    public void showTotal() {
        System.out.printf("У игрока " + name + " cумма очков " + totalPoints + "\n");
    }

    public int getTotalPoint() {
        return totalPoints;
    }
}
