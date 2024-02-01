package ChapterSevenExercisesTest.archeryGame;

import chapterSevenExercises.archeryPlayer.ArcheryGame;
import chapterSevenExercises.archeryPlayer.ArcheryPlayer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArcheryGameTest {

//    @BeforeEach
//    public void doThisTestBeforeAnyTest(){
//
//    }
    @Test
    public void playerPlays_ScoreIsRecordedTest(){
        ArcheryPlayer archeryPlayer = new ArcheryPlayer();
        ArcheryGame archeryGame = new ArcheryGame();
        archeryGame.recordScore(5,archeryGame.playerNumber());
       int[][] result = {{5,-1,-1},{-1,-1,-1},{-1,-1,-1}};
       assertArrayEquals(result, archeryGame.scoreBoard());
    }
    @Test
    public void firstPlayerPlaysScoreIsRecorded_SecondPlayer_PlaysScoreIsRecordedTest(){
        ArcheryGame archeryGame = new ArcheryGame();
        ArcheryPlayer player1 = new ArcheryPlayer();
        player1.setPlayerNumber(1);
        ArcheryPlayer player2 = new ArcheryPlayer();
        player2.setPlayerNumber(2);
        archeryGame.recordScore(6, player1.getPlayerNumber());
        archeryGame.recordScore(4, player2.getPlayerNumber());
        int[][] result = {{6,-1,-1},{4,-1,-1},{-1,-1,-1}};
        System.out.println(Arrays.deepToString(archeryGame.scoreBoard()));
        assertArrayEquals(result, archeryGame.scoreBoard());
    }
    @Test
    public void allPlayersPlayScoreIsRecordedTest(){
        ArcheryGame archeryGame = new ArcheryGame();
        ArcheryPlayer player1 = new ArcheryPlayer();
        player1.setPlayerNumber(1);
        ArcheryPlayer player2 = new ArcheryPlayer();
        player2.setPlayerNumber(2);
        ArcheryPlayer player3 = new ArcheryPlayer();
        player3.setPlayerNumber(3);
        archeryGame.recordScore(6, player1.getPlayerNumber());
        archeryGame.recordScore(4, player2.getPlayerNumber());
        archeryGame.recordScore(4, player3.getPlayerNumber());
        archeryGame.recordScore(7, player1.getPlayerNumber());
        archeryGame.recordScore(1, player2.getPlayerNumber());
        archeryGame.recordScore(8, player3.getPlayerNumber());
        archeryGame.recordScore(3, player1.getPlayerNumber());
        archeryGame.recordScore(6, player2.getPlayerNumber());
        archeryGame.recordScore(5, player3.getPlayerNumber());

        int[][] result = {{6,7,3},{4,1,6},{4,8,5}};
    }


}
