package ChapterSevenExercisesTest.archeryGame;

import chapterSevenExercises.archeryPlayer.ArcheryGame;
import chapterSevenExercises.archeryPlayer.ArcheryPlayer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArcheryGameTest {

//    @BeforeEach
//    public void doThisTestBeforeAnyTest(){
//
//    }
    @Test
    public void playerPlays_ScoreIsRecordedTest(){
//        ArcheryPlayer archeryPlayer = new ArcheryPlayer();
        ArcheryGame archeryGame = new ArcheryGame();
        int[][] record = archeryGame.recordScore(5,archeryGame.playerNumber());
       int[][] result = {{5,-1,-1,-1},{-1,-1,-1,-1},{-1,-1,-1,-1}};
       assertArrayEquals(result, record);
    }
//    @Test
//    public void
}
