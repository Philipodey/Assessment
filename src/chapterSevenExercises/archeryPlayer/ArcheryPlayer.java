package chapterSevenExercises.archeryPlayer;

import java.security.SecureRandom;

public class ArcheryPlayer {
    private int playerNumber;

    private final int chances = 3;

    public ArcheryPlayer(){

    }
    public int playerChances(){
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(0,11);
    }
    public void setPlayerNumber(int number){
        playerNumber = number-1;
    }
    public int getPlayerNumber(){
        return playerNumber;
    }




}
