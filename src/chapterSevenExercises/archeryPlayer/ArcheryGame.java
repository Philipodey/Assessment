package chapterSevenExercises.archeryPlayer;

import java.util.Arrays;

public class ArcheryGame {
    private final ArcheryPlayer archeryPlayer = new ArcheryPlayer();
    private final int[][] playerTable = new int[3][3];

    public ArcheryGame() {
        ArcheryPlayer archeryPlayer = new ArcheryPlayer();
//        for (int[] ints : playerTable) {
//            Arrays.fill(ints, archeryPlayer.playerChances());
//
//        }
        for (int counter = 0; counter < playerTable.length; counter++) {
            for (int count = 0; count < playerTable[counter].length; count++) {
                playerTable[counter][count] = archeryPlayer.playerChances();
            }
        }

    }

    public void recordScore(int playerPoint, int playerNumber) {
        int index = 0;
        for (int count = 0; count < playerTable.length; count++) {
            if(playerTable[playerNumber][count] == -1) {
                playerTable[playerNumber][index] = playerPoint;

                break;

            }
            index++;
        }
    }

    public int[][] scoreBoard() {
        return playerTable;
    }

    public int playerPlay() {
        return archeryPlayer.playerChances();
    }

    public void inputPlayerNumber(int playerNumber) {
        archeryPlayer.setPlayerNumber(playerNumber);
    }

    public int playerNumber() {
        return archeryPlayer.getPlayerNumber();
    }

    public void tableHeading(){
            System.out.printf("%-10s", " ");
            System.out.printf("%13s", "first chance");
            System.out.printf("%15s", "second chance");
            System.out.printf("%14s", "third chance");
            System.out.printf("%10s", "Total");
            System.out.println();
        for (int rowHeading = 0; rowHeading < playerTable.length; rowHeading++) {
            System.out.print((rowHeading+1)+ " ");
            int total = 0;
            for (int columnHeading = 0; columnHeading < playerTable[rowHeading].length; columnHeading++) {
                System.out.printf("%15s",playerTable[rowHeading][columnHeading]);
                total += playerTable[rowHeading][columnHeading];

            }
            System.out.printf("%12s",total);
            System.out.println();

        }

    }

    public static void main(String[] args) {
        ArcheryGame archeryGame = new ArcheryGame();
        archeryGame.tableHeading();
    }

}
