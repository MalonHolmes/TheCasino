package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements Gamble{

    private Double money;
    private Double startAmount;
    private Integer gamesWon;
    private Integer gamesLost;
    private ArrayList<Card> hand;

    public Player(){
        startAmount = 100.0;
        money = 100.0;
        gamesWon = 0;
        gamesLost = 0;
        hand = new ArrayList<>();
    }

    public Double getMoney() {
        return money;
    }

    public Double wage() {
        Scanner scnr = new Scanner(System.in);
        System.out.print("What would you like to wage?\n$");

        Double amountWaged = scnr.nextDouble();

        while (amountWaged > getMoney()){
            System.out.print("Not enough funds. Try  waging a smaller amount.\n$");
            amountWaged = scnr.nextDouble();
        }
        return (amountWaged * 2);
    }

    public void winnings(Double amount){
        money += amount;
    }

    public void losses(Double amount){
        money -= amount;
    }

    public void addToHand(Card card){
        hand.add(card);
    }

    /*
    PLAYER LEAVES CASINO
    public void leaveCasino(){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Are you sure you would like to leave the casino and end your stay here?");


        System.out.println("Thanks for playing!\nYou started with $"+ startAmount +". Now, you leave with $" + money);
        // check out areWeThereYet()
    } */

    public static void main(String[] args){
        //testing wage()

        Player player = new Player();

        System.out.println(player.wage());

    }

}
