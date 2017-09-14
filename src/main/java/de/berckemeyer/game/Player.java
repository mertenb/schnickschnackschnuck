package de.berckemeyer.game;

import de.berckemeyer.game.types.MoveType;

/**
 * A Player is a person who participate on the game.
 * @author merten
 */
public class Player {
    private Strategie strategie;
    
    /**
     * Every player of this game has a strategie for this game.
     * @param strategie a strategie to win. Must not be <code>null</code>.
     */
    public Player(Strategie strategie) {
        assert(strategie != null);
        this.strategie = strategie;
    }

    
    /**
     * Do the move for the game.
     * @return the move, choosen by players strategie.
     */
    public MoveType doMove() {
        return strategie.getMove();
    }
}
