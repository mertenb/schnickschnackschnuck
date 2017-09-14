package de.berckemeyer.game;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import de.berckemeyer.game.types.MoveType;

public class StrategieRandomTest {

    @Test
    /**
     * Test if the move of this strategie deliver random moves. <br>
     * NOTE: this is not 100% exact but it is very unlikely that random takes 10000 times the same move in life of this code.
     */
    public void testGetMove() {
        List<MoveType> moveList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            StrategieRandom strategie = new StrategieRandom();
            moveList.add(strategie.getMove());
        }
        long countScissors = moveList.stream().filter(e -> e.equals(MoveType.SCISSORS)).count();
        long countStone = moveList.stream().filter(e -> e.equals(MoveType.STONE)).count();
        long countPaper = moveList.stream().filter(e -> e.equals(MoveType.PAPER)).count();
        Assert.assertTrue("The result of the strategie differs.", (countScissors > 0) && (countStone > 0) && (countPaper > 0) );
    }
}
