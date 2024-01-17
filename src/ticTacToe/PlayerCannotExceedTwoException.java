package ticTacToe;

import ticTacToe.exceptions.TicTacToeException;

public class PlayerCannotExceedTwoException extends TicTacToeException {

    public PlayerCannotExceedTwoException(String message) {
        super(message);
    }
}
