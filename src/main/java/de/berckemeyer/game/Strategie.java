package de.berckemeyer.game;

import de.berckemeyer.game.types.MoveType;

/**
 * 
 * @author merten
 *
 */
public interface Strategie {
    
    /**
     * Get the move. The implementors can implement here the perfect strategie ...
     * @return the next move for the game.
     */
    public MoveType getMove();
}
