package com.codedifferently.casino;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CasinoTest {

    Casino casino;

    @Before
    public void setup(){
        casino = new Casino();
    }

    @Test
    public void getNumOfGamesTest(){
        // Given
        Integer expected = 2;

        // When
        Integer actual = casino.getNumOfGames();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumOfPlayersTest(){
        // Given
        Integer expected = 1;
        Player player1 = new Player();

        // When
        casino.addPlayer(player1);
        Integer actual = casino.getNumOfPlayers();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addPlayerTest(){
        // Given
        Integer expected = 1;
        Player player1 = new Player();

        // When
        casino.addPlayer(player1);
        Integer actual = casino.getNumOfPlayers();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
