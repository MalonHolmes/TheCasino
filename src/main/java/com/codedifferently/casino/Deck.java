package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards = new ArrayList<>();
    private Integer numOfCards;

    public Deck(){
        Card card;
        for (Card.SUITS suit : Card.SUITS.values()) {
            for (Card.VALUES value : Card.VALUES.values()) {
                card = new Card(suit,value);
                cards.add(card);
            }
        }
        numOfCards = cards.size();
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card pickFromTop(){
        if (cards.isEmpty()){
            System.out.println("No cards in deck");
            return null;
        }
        numOfCards--;
        return cards.remove(0);
    }

    public Card getTopCard(){
        if (cards.isEmpty()){
            System.out.println("No cards in deck");
            return null;
        }
        return cards.get(0);
    }

    public Integer getNumOfCards() {
        return numOfCards;
    }

}
