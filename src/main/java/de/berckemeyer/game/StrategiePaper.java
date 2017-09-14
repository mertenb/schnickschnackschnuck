package de.berckemeyer.game;

import de.berckemeyer.game.types.MoveType;

/**
 * Strategie that always return the paper move.
 * @author merten
 *
 */
public class StrategiePaper implements Strategie {
    /**
     * Returns always the paper move. 
     */
    public MoveType getMove() {
        return MoveType.PAPER;
    }
}
