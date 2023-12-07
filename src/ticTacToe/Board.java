package ticTacToe;

import java.util.Arrays;

public class Board {
//    public Player playerX;
    private TicTacSigns[][] boards = new TicTacSigns[3][3];

    public Board() {
        for (TicTacSigns[] ticTacSigns : boards) {
            Arrays.fill(ticTacSigns, TicTacSigns.Empty);
        }
    }

    public TicTacSigns moves() {
        return null;
    }

    public TicTacSigns[][] displayBoard() {
        return boards;
    }

    public void playerMoves(Player player, int positionToPlay) {
        if (positionToPlay == 1){
            boards[0][0] = player.getTicTacSigns();
        }
        else if(positionToPlay == 2){
            boards[0][1] = player.getTicTacSigns();}
        else if (positionToPlay == 3) {
            boards[0][2] = player.getTicTacSigns();
        } else if (positionToPlay == 4) {
            boards[1][0] = player.getTicTacSigns();
        } else if (positionToPlay == 5) {
            boards[1][1] = player.getTicTacSigns();
        } else if (positionToPlay == 6) {
            boards[1][2] = player.getTicTacSigns();
        } else if (positionToPlay == 7) {
            boards[2][0] = player.getTicTacSigns();
        } else if (positionToPlay == 8){
            boards[2][1] = player.getTicTacSigns();
        } else if (positionToPlay == 9){
            boards[2][2] = player.getTicTacSigns();}

    }

}
