package ticTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ticTacToe.TicTacSigns.*;

class TicTacToeTest {
    TicTacToe ticTacToe;
    Board board;
    Player player;
    @BeforeEach
    public void check_Test_First(){
        ticTacToe = new TicTacToe();
        board = new Board();
        player = new Player(X);

    }
    @Test
    public void constructor_ShouldInitializeBoardToEmptyTest() {

        TicTacSigns[][] board1 = ticTacToe.displayBoard();
        TicTacSigns[][] result = {{Empty, Empty, Empty}, {Empty, Empty, Empty},
                {Empty, Empty, Empty}};
        assertArrayEquals(result, board1);
    }
    @Test
    public void test_ThatPlayerCanPlayTheGame(){
        Player[] player = ticTacToe.getPlayer();
//        Player sign = new Player(player[0].getTicTacSigns());
//        ticTacToe.play(1, sign);
        assertEquals(player[0].getTicTacSigns(), X);

    }
    @Test
    public void playerCanPlay_OnTheBoardTest(){
        Player[] player = ticTacToe.getPlayer();
        TicTacSigns[][] expected = {{X,Empty, Empty},{Empty, Empty, Empty},
                {Empty, Empty, Empty}};

        int positionToPlay = 1;
        ticTacToe.play(positionToPlay, player[0]);
        assertArrayEquals(expected, ticTacToe.displayBoard());
    }
    @Test
    public void testThatTwoPlayersCanPlay(){
        Player[] player = ticTacToe.getPlayer();
        TicTacSigns[][] expected = {{X,Empty, Empty},{O, Empty, Empty},
                {Empty, Empty, Empty}};

        int positionToPlay = 1;
        ticTacToe.play(positionToPlay, player[0]);
        int positionToPlay2 = 4;
        ticTacToe.play(positionToPlay2, player[1]);
        assertArrayEquals(expected, ticTacToe.displayBoard());
    }
    @Test
    public void testThatPlayerCanWin(){
        Player[] player = ticTacToe.getPlayer();
        TicTacSigns[][] expected = {{X,X, X},{Empty, Empty, Empty},
                {Empty, Empty, Empty}};
        ticTacToe.verticalWin();
        assertArrayEquals(expected, ticTacToe.displayBoard());
    }



}