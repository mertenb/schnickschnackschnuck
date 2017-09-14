package de.berckemeyer.game;

import static de.berckemeyer.game.types.MoveType.PAPER;
import static de.berckemeyer.game.types.MoveType.SCISSORS;
import static de.berckemeyer.game.types.MoveType.STONE;
import static de.berckemeyer.game.types.ResultType.LOST;
import static de.berckemeyer.game.types.ResultType.UNDECIDED;
import static de.berckemeyer.game.types.ResultType.WON;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import de.berckemeyer.game.types.MoveType;
import de.berckemeyer.game.types.ResultType;

/**
 * Check the gamin rules.
 * @author merten
 *
 */
@RunWith(Parameterized.class)
public class RuleTest {

    @Parameter(0)
    public MoveType move1;
    @Parameter(1)
    public MoveType move2;
    @Parameter(2)
    public ResultType result;

    @Test
    public void testGetResult4Move1() {
        assertTrue("Rule for this move is o.k.",Rule.getResult4Move1(move1, move2).equals(result));
    }

    // creates all combinations of the game.
    @Parameters
    //@formatter:off
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { 
            { SCISSORS , SCISSORS, UNDECIDED }, 
            { SCISSORS , STONE, LOST },
            { SCISSORS , PAPER, WON },
            { PAPER , PAPER, UNDECIDED },
            { PAPER , SCISSORS, LOST },
            { PAPER , STONE, WON },
            { STONE , STONE, UNDECIDED },
            { STONE , SCISSORS, WON },
            { STONE , PAPER, LOST }
        };
        return Arrays.asList(data);
    }
    //@formatter:on
}
