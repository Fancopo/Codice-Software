package it.polimi.ingsw.am22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    void shouldInitializePlayerCorrectly() {
        Player player = new Player("Alice");

        assertEquals("Alice", player.getNickname());
        assertEquals(0, player.getPP());
        assertEquals(0, player.getFood());
        assertNotNull(player.getTribe());
    }
}