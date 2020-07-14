package com.codedifferently.casino;


import java.util.ArrayList;

public class Casino {

    private ArrayList<Player> players = new ArrayList<>();
    private Integer numOfGames;
    private Integer numOfPlayers;

    /*
    public Casino(ArrayList<Player> players, Integer numOfGames){
        this.players = players;
        this.numOfGames = numOfGames;
    }
     */

    public Integer getNumOfGames() {
        return 2;
    }

    public Integer getNumOfPlayers(){
        return players.size();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public static void main(String[] args){
        // Run the simulation below
    }

}
