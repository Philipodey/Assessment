package ticTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ticTacToe.TicTacSigns.Empty;
import static ticTacToe.TicTacSigns.X;

class BoardTest {
    private Board board;
    @BeforeEach
    private void checkThisTestFirst(){
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
        Player player1 = new Player(X);
        TicTacSigns[][] expected = {{X,Empty, Empty},{Empty, Empty, Empty},
                {Empty, Empty, Empty}};
        int positionToPlay = 1;
        TicTacSigns[][] board1 = board.displayBoard();
        TicTacToe ticTacToe = new TicTacToe();
        Player[] players = ticTacToe.getPlayer();
        ticTacToe.play(positionToPlay,players[0]);
        assertArrayEquals(expected, board1);
    }
    @Test
    public void testThatTwoPlayerscanPlayTest(){

    }
}