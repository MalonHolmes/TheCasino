package com.codedifferently.casino;

import jdk.jshell.execution.DirectExecutionControl;
import org.junit.Assert;
import org.junit.Test;


public class CardTest {

    @Test
    public void constructorTest(){
        // Given

        Card.SUITS expectedSuit = Card.SUITS.CLUBS;
        Card.VALUES expectedValue = Card.VALUES.FIVE;
        Card card = new Card(expectedSuit,expectedValue);

        // When
        Card.SUITS actualSuit = card.getSuit();
        Card.VALUES actualValue = card.getValue();

        // Then
        Assert.assertEquals(expectedSuit,actualSuit);
        Assert.assertEquals(expectedValue,expectedValue);

    }

}
