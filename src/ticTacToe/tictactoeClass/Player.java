package ticTacToe.tictactoeClass;

import chapterSix.SecureRandomIntegers;
import ticTacToe.constantClass.GameStatus;
import ticTacToe.constantClass.TicTacSigns;
import ticTacToe.exceptions.InvalidNumberException;
import ticTacToe.exceptions.NoSignsToChooseException;
import ticTacToe.exceptions.PositionIsNotEmptyException;

import java.util.Random;

import static ticTacToe.constantClass.GameStatus.DRAW;
import static ticTacToe.constantClass.GameStatus.WIN;
import static ticTacToe.constantClass.TicTacSigns.*;

public class Player{
//    private final TicTacToe ticTacToe = new TicTacToe();
    private final Board board = new Board();
    //    private final TicTacSigns[][] boards = board.displayBoard();
    private final Boolean play = false;
    private GameStatus gameStatus;
    private String playerName;

    public void play(String userInput, TicTacSigns signs) {
        switch (userInput) {
            case "1" -> {
                if (board.displayBoard()[0][0] == Empty) {
                    board.displayBoard()[0][0] = signs;
                } else {
                    throw new PositionIsNotEmptyException("Position is not Empty!\n Try another number");
                }
            }
            case "2" -> {
                if (board.displayBoard()[0][1] == Empty) {
                    board.displayBoard()[0][1] = signs;
                } else {
                    throw new PositionIsNotEmptyException("Position is not Empty!\n Try another number");
                }
            }
            case "3" -> {
                if (board.displayBoard()[0][2] == Empty) {
                    board.displayBoard()[0][2] = signs;
                } else {
                    throw new PositionIsNotEmptyException("Position is not Empty!\n Try another number");
                }
            }
            case "4" -> {
                if (board.displayBoard()[1][0] == Empty) {
                    board.displayBoard()[1][0] = signs;
                } else {
                    throw new PositionIsNotEmptyException("Position is not Empty!\n Try another number");
                }
            }
            case "5" -> {
                if (board.displayBoard()[1][1] == Empty) {
                    board.displayBoard()[1][1] = signs;
                } else {
                    throw new PositionIsNotEmptyException("Position is not Empty!\n Try another number");
                }
            }
            case "6" -> {
                if (board.displayBoard()[1][2] == Empty) {
                    board.displayBoard()[1][2] = signs;
                } else {
                    throw new PositionIsNotEmptyException("Position is not Empty!\n Try another number");
                }
            }
            case "7" -> {
                if (board.displayBoard()[2][0] == Empty) {
                    board.displayBoard()[2][0] = signs;
                } else {
                    throw new PositionIsNotEmptyException("Position is not Empty!\n Try another number");
                }
            }
            case "8" -> {
                if (board.displayBoard()[2][1] == Empty) {
                    board.displayBoard()[2][1] = signs;
                } else {
                    throw new PositionIsNotEmptyException("Position is not Empty!\n Try another number");
                }
            }
            case "9" -> {
                if (board.displayBoard()[2][2] == Empty) {
                    board.displayBoard()[2][2] = signs;
                } else {
                    throw new PositionIsNotEmptyException("Position is not Empty!\n Try another number");
                }
            }

            default -> throw new InvalidNumberException("Invalid number\n Try another number");
        }
    }


    public TicTacSigns chooseSign(String userInput) {
        TicTacSigns ticTacSigns;
        if (userInput.equals("X")) ticTacSigns = X;
        else if(userInput.equals("O")) ticTacSigns = O;
        else throw new NoSignsToChooseException();
        return ticTacSigns;
    }

    public void setName(String name) {
        playerName = name;
    }

    public String getName() {
        return playerName;
    }
    public TicTacSigns[][] boards(){
        return board.displayBoard();
    }

    public boolean win() {
        horizontalWin();
        diagonalWin();
        verticalWin();
        return false;
    }

    private void diagonalWin() {
        boolean diagonalPlay = (board.displayBoard()[0][2] == O && board.displayBoard()[1][1] == O && board.displayBoard()[2][0] == O) ||
                (board.displayBoard()[0][0] == O && board.displayBoard()[1][1] == O && board.displayBoard()[2][2] == O)
                || (board.displayBoard()[0][0] == X && board.displayBoard()[1][1] ==  X && board.displayBoard()[2][2] == X)
                ||(board.displayBoard()[0][2] == O && board.displayBoard()[1][1] ==  O && board.displayBoard()[2][0] == O)
                || (board.displayBoard()[0][0] == O && board.displayBoard()[1][1] ==  O && board.displayBoard()[2][2] == O)
                || (board.displayBoard()[0][2] == X && board.displayBoard()[1][1] ==  X && board.displayBoard()[2][0] == X);
        if (diagonalPlay){
            boolean diagonalWinStatus = gameStatus == WIN;
        };

    }

    private void horizontalWin() {
        if (board.displayBoard()[0][0] == X && board.displayBoard()[0][1] == X && board.displayBoard()[0][2] == X){ gameStatus = WIN;}
        if (board.displayBoard()[0][0] == O && board.displayBoard()[0][1] == O && board.displayBoard()[0][2] == O){ gameStatus = WIN;}
        if (board.displayBoard()[1][0] == X && board.displayBoard()[1][1] == X && board.displayBoard()[1][2] == X){ gameStatus = WIN;}
        if (board.displayBoard()[1][0] == O && board.displayBoard()[1][1] == O && board.displayBoard()[1][2] == O){ gameStatus = WIN;}
        if (board.displayBoard()[2][0] == X && board.displayBoard()[2][1] == X && board.displayBoard()[2][2] == X){ gameStatus = WIN;}
        if (board.displayBoard()[2][0] == O && board.displayBoard()[2][1] == O && board.displayBoard()[2][2] == O){ gameStatus = WIN;}
    }
    private void verticalWin(){
        if (board.displayBoard()[0][0] == X && board.displayBoard()[1][0] == X && board.displayBoard()[2][0] == X){ gameStatus = WIN;}
        if (board.displayBoard()[0][0] == O && board.displayBoard()[1][0] == O && board.displayBoard()[2][0] == O){ gameStatus = WIN;}
        if (board.displayBoard()[0][1] == X && board.displayBoard()[1][1] == X && board.displayBoard()[2][1] == X){ gameStatus = WIN;}
        if (board.displayBoard()[0][1] == O && board.displayBoard()[1][1] == O && board.displayBoard()[2][1] == O){ gameStatus = WIN;}
        if (board.displayBoard()[0][2] == X && board.displayBoard()[1][2] == X && board.displayBoard()[2][2] == X){ gameStatus = WIN;}
        if (board.displayBoard()[0][2] == O && board.displayBoard()[1][2] == O && board.displayBoard()[2][2] == O){ gameStatus = WIN;}
    }
    public GameStatus getGameStatus(){
        return gameStatus;
    }

    public void draw() {
        if (!win()) gameStatus = DRAW;
        System.out.println("It is draw!!!");
    }
    public String computerTurn(){
        Random random = new Random();
        int computerPlay = random.nextInt(9)+ 1;
        return String.valueOf(computerPlay);
    }



//    private TicTacSigns[][] move(int row, int column, TicTacSigns ticTacSigns) {
//
//    }
}
