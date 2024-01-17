package ticTacToe.tictactoeClass;

import ticTacToe.constantClass.TicTacSigns;
import ticTacToe.exceptions.InvalidNumberException;

import java.util.Arrays;

public class Board {
//    public Player playerX;
    private final TicTacSigns[][] boards = new TicTacSigns[3][3];

    public Board() {
        for (TicTacSigns[] ticTacSigns : boards) {
            Arrays.fill(ticTacSigns, TicTacSigns.Empty);
        }
    }


    public TicTacSigns[][] displayBoard() {
        return boards;
    }


}
