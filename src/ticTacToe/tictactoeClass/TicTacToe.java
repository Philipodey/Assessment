package ticTacToe.tictactoeClass;

import ticTacToe.constantClass.GameStatus;
import ticTacToe.constantClass.TicTacSigns;
import ticTacToe.tictactoeClass.Board;
import ticTacToe.tictactoeClass.Player;

import static ticTacToe.constantClass.GameStatus.*;
import static ticTacToe.constantClass.TicTacSigns.O;
import static ticTacToe.constantClass.TicTacSigns.X;

    public class TicTacToe {

        Board board = new Board();

        Player player = new Player();

//    GameStatus gameStatus = DRAW;

        public TicTacToe() {

        }

        public void ticTacToeDisplay() {
            System.out.println(board.displayBoard()[0][0] + "|" + board.displayBoard()[0][1] + "|" + board.displayBoard()[0][2]);
            System.out.println("-+-+-");
            System.out.println(board.displayBoard()[1][0] + "|" + board.displayBoard()[1][1] + "|" + board.displayBoard()[1][2]);
            System.out.println("-+-+-");
            System.out.println(board.displayBoard()[2][0] + "|" + board.displayBoard()[2][1] + "|" + board.displayBoard()[2][2]);
        }
        public boolean boardFull(TicTacSigns[][] boards){
            boolean isFull = true;
            for (TicTacSigns[] board : boards) {
                for (TicTacSigns signs : board) {
                    if (!(signs == TicTacSigns.Empty)) return isFull;
                }
            }
            return isFull;
        }
    }




