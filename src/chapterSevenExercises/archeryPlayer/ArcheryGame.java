package chapterSevenExercises.archeryPlayer;

import java.util.Arrays;

public class ArcheryGame {
    public static int chance = 0;
    ArcheryPlayer archeryPlayer = new ArcheryPlayer();
    private final int[][] playerTable = new int[3][4];
    public ArcheryGame(){
        for (int count = 0; count < playerTable.length; count++) {
            Arrays.fill(playerTable[count], -1);

        }

    }
    public int[][] recordScore(int playerPoint, int playerNumber){
            playerTable[playerNumber][chance++] = playerPoint;
        return playerTable;
    }
    public int[][] scoreBoard(){
        return playerTable;
    }

    public int playerPlay(){
        return archeryPlayer.playerChances();
    }
    public void inputPlayerNumber(int playerNumber){
        archeryPlayer.setPlayerNumber(playerNumber);
    }
    public int playerNumber(){
        return archeryPlayer.getPlayerNumber();
    }
//    public
}
