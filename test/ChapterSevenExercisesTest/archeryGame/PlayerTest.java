package ChapterSevenExercisesTest.archeryGame;

import chapterSevenExercises.archeryPlayer.ArcheryPlayer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void testThatPlayerGetsAChanceTest(){
        ArcheryPlayer player = new ArcheryPlayer();
        int score = player.playerChances();
        boolean scoreRange = score > 0 && score <= 10;
        assertTrue(scoreRange);
    }
//    @Test
//    public void testThatDifferentPlayersCanHaveDifferentChances(){
//        ArcheryPlayer player = new ArcheryPlayer();
//
//    }
}
