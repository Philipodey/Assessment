package ticTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ticTacToe.TicTacSigns.Empty;
import static ticTacToe.TicTacSigns.X;

class PlayerTest {
    private Player player;
    @BeforeEach
    public void startEachTestWith(){
        player = new Player(X);
    }
    @Test
    public void playerCanChooseBetweenXAndO(){
        player.setTicTacSigns(X);
        assertEquals(player.getTicTacSigns(), X);
    }
    @Test
    public void playerCanSetNameTest(){
        String name = "philip";
        String playerName = player.setName(name);
        assertEquals(name, playerName);
    }
    @Test
    public void playerCanMoveTest(){
        Board board = new Board();
        player.setTicTacSigns(X);
        int position = 1;
        TicTacSigns[][] expected = {{X,Empty, Empty},{Empty, Empty, Empty},
                {Empty, Empty, Empty}};

        assertArrayEquals(expected, board.displayBoard());
    }

}