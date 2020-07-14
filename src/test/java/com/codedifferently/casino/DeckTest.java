package com.codedifferently.casino;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;

public class DeckTest {

    @Test
    public void constructorTest(){
        // Given
        Deck deck1 = new Deck();

        // When
        Integer expectedSize = 52;
        Integer actualSize = deck1.getNumOfCards();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void shuffleTest(){
        // Given
        Deck deck = new Deck();
        Card expected = deck.getTopCard();

        // When
        deck.shuffle();
        Card actual = deck.getTopCard();

        // Then
        Assert.assertNotEquals(expected,actual);
    }

    @Test
    public void getTopCardTest(){
        // Given

        // When

        // Then

    }



}
