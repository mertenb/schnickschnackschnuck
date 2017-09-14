package de.berckemeyer.game;


import static de.berckemeyer.game.types.MoveType.PAPER;
import static de.berckemeyer.game.types.MoveType.SCISSORS;
import static de.berckemeyer.game.types.MoveType.STONE;
import static de.berckemeyer.game.types.ResultType.LOST;
import static de.berckemeyer.game.types.ResultType.UNDECIDED;
import static de.berckemeyer.game.types.ResultType.WON;

import de.berckemeyer.game.types.MoveType;
import de.berckemeyer.game.types.ResultType;

/**
 * Implements the rule of this game.
 * @author merten
 *
 */
public class Rule {
    
    /**
     * Returns, if move1 has won or lost over move 2 or if it is undecided.
     * @param move1 the move to inspect.
     * @param move2 the other move in this game.
     * @return {@link ResultType.WON} if move1 has won against move2. <br>
     *  {@link ResultType.LOST} if move1 has lost against move2. <br>
     *  {@link ResultType.UNDECIDED} if move1 is the same as move2. <br>
     */
    public static ResultType getResult4Move1(MoveType move1, MoveType move2) {
        if (move1.equals(move2)) return UNDECIDED;
        if (move1.equals(PAPER)) {
            return (move2.equals(STONE)) ? WON : LOST;
        }
        if (move1.equals(SCISSORS)) {
            return (move2.equals(PAPER)) ? WON : LOST;
        }
        if (move1.equals(STONE)) {
            return (move2.equals(SCISSORS)) ? WON : LOST;
        }
        throw new RuntimeException("Unknown combination of movetypes");
    }
}
