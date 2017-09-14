package de.berckemeyer.game;

import org.junit.Assert;
import org.junit.Test;

import de.berckemeyer.game.types.MoveType;

public class StrategiePaperTest {

    @Test
    /**
     * Test if the move of this strategie deliver always PAPER. <br>
     * NOTE: this is not 100% exact but it is unlikely that random takes 1000 times the paper move.
     */
    public void testGetMove() {
        for (int i = 0; i < 1000; i++) {
            StrategiePaper strategie = new StrategiePaper();
            Assert.assertTrue("The result of the move is always PAPER", strategie.getMove().equals(MoveType.PAPER));
        }
    }
}
