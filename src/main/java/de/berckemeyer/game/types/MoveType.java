package de.berckemeyer.game.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * One of the move must be used by a player if he plays this game.
 * 
 * @author merten
 *
 */
public enum MoveType {
    PAPER, SCISSORS, STONE;

    private static final List<MoveType> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    /**
     * Select a random move. 
     * @see https://stackoverflow.com/questions/1972392/java-pick-a-random-value-from-an-enum
     * @return one of a move by random algorithm.
     */
    public static MoveType randomMove() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
