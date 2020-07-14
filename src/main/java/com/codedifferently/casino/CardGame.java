package com.codedifferently.casino;

public class CardGame {

    private Player winner;
    private Player loser;
    private Player[] players;
    private boolean canGamble;
    private Deck deck;

    public CardGame(Player[] players, boolean canGamble, Deck deck){
        this.players = players;
        this.canGamble = canGamble;
        this.deck = deck;
    }

    public Integer getNumOfPlayers(){
        return players.length;
    }

}
