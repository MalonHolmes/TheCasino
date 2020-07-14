package com.codedifferently.casino;

public class Card {

    static enum SUITS{
        SPADES,CLUBS,HEARTS,DIAMONDS;
    }

    static enum VALUES{
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    }

    private SUITS suit;
    private VALUES value;

    public Card(SUITS suit, VALUES value){
        this.suit = suit;
        this.value = value;
    }

    public SUITS getSuit(){
        return suit;
    }

    public VALUES getValue(){
        return value;
    }

}
