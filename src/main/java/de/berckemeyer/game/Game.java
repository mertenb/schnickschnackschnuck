package de.berckemeyer.game;

import java.util.ArrayList;
import java.util.List;

import de.berckemeyer.game.types.ResultType;

/**
 * The entry point for the game.
 * @author merten
 *
 */
public class Game {

    private static Player playerA;
    private static Player playerB;
    private static List<ResultType> playerAResultList;
    
    /**
     * Entry point for this application. Given arguments will be ignored.
     * @param args ignored.
     */
    public static void main(String[] args) {
        init();
        run();
        done();
    }
    
    private static void init() {
        playerA = new Player(new StrategieRandom());
        playerB = new Player(new StrategiePaper());
        playerAResultList = new ArrayList<ResultType>();
    }
    
    private static void run() {
        for (int i = 0; i < 100; i++) {
            playerAResultList.add(Rule.getResult4Move1(playerA.doMove(), playerB.doMove()));
        }
    }
    
    private static void done() {
        long won = playerAResultList.stream().filter(e -> ResultType.WON.equals(e)).count();
        long lost = playerAResultList.stream().filter(e -> ResultType.LOST.equals(e)).count();
        long undecided = playerAResultList.stream().filter(e -> ResultType.UNDECIDED.equals(e)).count();
        System.out.println("Player A WIN   : " + won);
        System.out.println("Player A LOST  : " + lost);
        System.out.println("Undecided      : " + undecided);
        System.out.println("GAME OVER");
    }
}
