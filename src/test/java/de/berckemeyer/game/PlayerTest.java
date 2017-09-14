package de.berckemeyer.game;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

    /**
     * Check if it is possible to create an invalid player.
     */
    @Test(expected = java.lang.AssertionError.class)
    public void testInvalidPlayerCreation() {
        new Player(null);
    }
    
    /**
     * Check if it possible to create a player with a valid strategie.
     */
    @Test
    public void testValidPlayerInstantiation() {
        Player player = new Player(new StrategiePaper());
        Assert.assertTrue("Valid Player could be created.",player != null);
    }

}
