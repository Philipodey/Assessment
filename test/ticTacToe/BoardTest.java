package ticTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ticTacToe.constantClass.TicTacSigns;
import ticTacToe.tictactoeClass.Board;
import ticTacToe.tictactoeClass.Player;
import ticTacToe.tictactoeClass.TicTacToe;

import static org.junit.jupiter.api.Assertions.*;
import static ticTacToe.constantClass.TicTacSigns.Empty;
import static ticTacToe.constantClass.TicTacSigns.X;

class BoardTest {
    private Board board;
    @BeforeEach
    public void checkThisTestFirst(){
        board = new Board();
    }
    @Test
    public void constructor_ShouldInitializeBoardToEmptyTest(){
        TicTacSigns[][] board1 = board.displayBoard();
        TicTacSigns[][] result = {{Empty,Empty,Empty}, {Empty, Empty, Empty},
                {Empty, Empty, Empty}};
        assertArrayEquals(result, board1);
    }
    @Test
    public void playerCanPlay_OnTheBoardTest(){
        Player player1 = new Player();
        TicTacSigns[][] expected = {{X,Empty, Empty},{Empty, Empty, Empty},
                {Empty, Empty, Empty}};
        int positionToPlay = 1;
        TicTacSigns[][] board1 = board.displayBoard();
        TicTacToe ticTacToe = new TicTacToe();
//        Player[] players = ticTacToe.getPlayer();
//        ticTacToe.play(positionToPlay,players[0]);
        assertArrayEquals(expected, board1);
    }
    @Test
    public void testThatTwoPlayersCanPlayTest(){

    }
}