package com.codedifferently.casino;

public interface Game {
    public void playGame();
    public void winningConditions();
    public Player getWinner();
    public Player getLoser();

}
