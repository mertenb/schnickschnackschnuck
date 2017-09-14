package de.berckemeyer.game;

import de.berckemeyer.game.types.MoveType;

/**
 * Strategie that takes a random move.
 * @author merten
 *
 */
public class StrategieRandom implements Strategie {

    /**
     * Returns a random move. 
     */
    public MoveType getMove() {
        return MoveType.randomMove();
    }
}
