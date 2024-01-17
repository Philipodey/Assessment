package ticTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ticTacToe.constantClass.TicTacSigns;
import ticTacToe.exceptions.PositionIsNotEmptyException;
import ticTacToe.tictactoeClass.Board;
import ticTacToe.tictactoeClass.Player;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static ticTacToe.constantClass.GameStatus.*;
import static ticTacToe.constantClass.TicTacSigns.*;

class PlayerTest {
    Player player;
    Board board;
    @BeforeEach
    public void startEachTestWith(){
        player = new Player();
        board = new Board();
    }
    @Test
    public void playerNameTest(){
        player.setName("Philip");
        assertEquals("Philip", player.getName());
    }
    @Test
    public void playerCanChooseSignTest(){
        TicTacSigns player1 = player.chooseSign("O");
        assertEquals(player1, O);
    }
    @Test
    public void playerCanPlayTest() {
        player.play("1", X);
        TicTacSigns[][] result = {{X, Empty, Empty}, {Empty, Empty, Empty},
                {Empty, Empty, Empty}};
        assertArrayEquals(result, player.boards());
    }
    @Test
    public void TwoPlayerCanPlayTest(){
        player.play("1", X);
        player.play("3", O);
        player.play("4", X);
        player.play("5", O);
        player.play("6", X);

        TicTacSigns[][] result = {{X, Empty, O}, {X, O, X},
                {Empty, Empty, Empty}};
        System.out.println(Arrays.deepToString(player.boards()));
        assertArrayEquals(result, player.boards());
    }
    @Test
    public void playerCanWinTest(){
        player.play("4", O);
        player.play("5", O);
        player.play("6", O);
        TicTacSigns[][] result = {{Empty, Empty, Empty}, {O, O, O}, {Empty, Empty, Empty}};
        player.win();
        System.out.println(Arrays.deepToString(player.boards()));
        assertArrayEquals(result, player.boards());
        assertEquals(WIN, player.getGameStatus());
    }
    @Test
    public void playerCannotPlayOnPositionThatIsNotEmptyTest(){
        player.play("7", O);
        player.play("8", O);
        player.play("9", O);
        TicTacSigns[][] result = {{Empty, Empty, Empty}, {Empty, Empty, Empty}, {O, O, O}};
        assertThrows(PositionIsNotEmptyException.class, ()-> player.play("7", O));
    }
    @Test
    public void playerCanWinDiagonallyTest(){
        player.play("1", O);
        player.play("5", O);
        player.play("9", O);
        TicTacSigns[][] result = {{O, Empty, Empty}, {Empty, O, Empty}, {Empty, Empty, O}};
        player.win();
        assertArrayEquals(result, player.boards());
        assertEquals(WIN, player.getGameStatus());
    }
    @Test
    public void playerCanWinVerticallyTest(){
        player.play("1", X);
        player.play("4", X);
        player.play("7", X);
        TicTacSigns[][] result = {{X, Empty, Empty}, {X, Empty, Empty}, {X, Empty, Empty}};
        player.win();
        assertArrayEquals(result, player.boards());
        assertEquals(WIN, player.getGameStatus());
    }
    @Test
    public void playersCanDrawTheGame(){
        player.play("1", X);
        player.play("2", O);
        player.play("3", X);
        player.play("4", X);
        player.play("5", O);
        player.play("6", X);
        player.play("7", O);
        player.play("8", X);
        player.play("9", O);
        TicTacSigns[][] result = {{X, O, X},
                                  {X, O, X},
                                  {O, X, O}};
        player.draw();
        assertArrayEquals(result, player.boards());
    }
//    @Test
//    public void testThatComputer

}