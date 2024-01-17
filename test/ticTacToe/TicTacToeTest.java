//package ticTacToe;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import ticTacToe.constantClass.GameStatus;
//import ticTacToe.constantClass.TicTacSigns;
//import ticTacToe.exceptions.InvalidNumberException;
//import ticTacToe.tictactoeClass.Board;
//import ticTacToe.tictactoeClass.Player;
//
//import java.util.Arrays;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static ticTacToe.constantClass.TicTacSigns.*;
//
//class TicTacToeTest {
//    TicTacToe ticTacToe;
//    Board board;
//    Player player;
//    @BeforeEach
//    public void check_Test_First(){
//        ticTacToe = new TicTacToe();
//        board = new Board();
//        player = new Player();
//
//    }
//    @Test
//    public void constructor_ShouldInitializeBoardToEmptyTest() {
//
//        TicTacSigns[][] board1 = ticTacToe.displayBoard();
//        TicTacSigns[][] result = {{Empty, Empty, Empty}, {Empty, Empty, Empty},
//                {Empty, Empty, Empty}};
//        assertArrayEquals(result, board1);
//    }
//    @Test
//    public void playerCannotExceedThrowExceptionTest(){
////        ticTacToe.setPlayer(1);
////        Player[] player = ticTacToe.getPlayer();
////        assertThrows(PlayerCannotExceedTwoException.class, ()-> player[3].getTicTacSigns());
//    }
////    @Test
////    public void test_ThatPlayerCanPlayTheGame(){
////            ticTacToe.setTicTacSigns("X");
//////        Player sign = new Player(player[0].getTicTacSigns());
////        ticTacToe.play(1, ticTacToe.getTicTacSigns());
////        assertEquals(ticTacToe.getTicTacSigns(), X);
//
//
//    @Test
//    public void playerCanPlay_OnTheBoardTest(){
////        Player[] player = ticTacToe.getPlayer();
//        TicTacSigns[][] expected = {{X,Empty, Empty},{Empty, Empty, Empty},
//                {Empty, Empty, Empty}};
//
//        int positionToPlay = 1;
////        ticTacToe.play(positionToPlay, player[0]);
//        assertArrayEquals(expected, ticTacToe.displayBoard());
//    }
//    @Test
//    public void testThatTwoPlayersCanPlay(){
////        Player[] player = ticTacToe.getPlayer();
//        TicTacSigns[][] expected = {{X,Empty, Empty},{O, Empty, Empty},
//                {Empty, Empty, Empty}};
//
//        int positionToPlay = 1;
////        ticTacToe.play(positionToPlay, player[0]);
//        int positionToPlay2 = 4;
////        ticTacToe.play(positionToPlay2, player[1]);
//        assertArrayEquals(expected, ticTacToe.displayBoard());
//    }
//    @Test
//    public void playerXCanWinAtTheFirstRowTest(){
////        Player[] player = ticTacToe.getPlayer();
//        TicTacSigns[][] expected = {{X,X, X},{Empty, Empty, Empty},
//                {Empty, Empty, Empty}};
////        ticTacToe.play(1, player[0]);
////        ticTacToe.play(2, player[0]);
////        ticTacToe.play(3, player[0]);
////        ticTacToe.horizontalWin();
//        assertArrayEquals(expected, ticTacToe.displayBoard());
//        System.out.println(ticTacToe.gameStatus);
//        assertEquals( GameStatus.WIN, ticTacToe.getGameStatus());
//    }
//     @Test
//    public void playerOCanWinAtTheFirstRowTest(){
////        Player[] player = ticTacToe.getPlayer();
//        TicTacSigns[][] expected = {{O,O, O},{Empty, Empty, Empty},
//                {Empty, Empty, Empty}};
//
//        ticTacToe.horizontalWin();
//        assertArrayEquals(expected, ticTacToe.displayBoard());
//        System.out.println(ticTacToe.gameStatus);
//        assertEquals( GameStatus.WIN, ticTacToe.getGameStatus());
//    }
//    @Test
//    public void playerXCanWinAtTheSecondRowTest(){
//
//        TicTacSigns[][] expected = {{Empty,Empty, Empty},{X, X, X},
//                {Empty, Empty, Empty}};
////        ticTacToe.play(4, player[0]);
////        ticTacToe.play(5, player[0]);
////        ticTacToe.play(6, player[0]);
//        ticTacToe.horizontalWin();
//        assertArrayEquals(expected, ticTacToe.displayBoard());
//        System.out.println(ticTacToe.gameStatus);
//        assertEquals( GameStatus.WIN, ticTacToe.getGameStatus());
//    }
//     @Test
//    public void playerOCanWinAtTheSecondRowTest(){
////        Player[] player = ticTacToe.getPlayer();
//        TicTacSigns[][] expected = {{Empty,Empty, Empty},{O, O, O},
//                {Empty, Empty, Empty}};
////        ticTacToe.play(4, player[1]);
////        ticTacToe.play(5, player[1]);
////        ticTacToe.play(6, player[1]);
//        ticTacToe.horizontalWin();
//        assertArrayEquals(expected, ticTacToe.displayBoard());
//        assertEquals( GameStatus.WIN, ticTacToe.getGameStatus());
//    }
//    @Test
//    public void playerXCanWinAtTheThirdRowTest(){
////        Player[] player = ticTacToe.getPlayer();
//        TicTacSigns[][] expected = {{Empty,Empty, Empty},{Empty, Empty, Empty},
//                {O, O, O}};
////        ticTacToe.play(7, player[1]);
////        ticTacToe.play(8, player[1]);
////        ticTacToe.play(9, player[1]);
//        ticTacToe.horizontalWin();
//        assertArrayEquals(expected, ticTacToe.displayBoard());
//        System.out.println(Arrays.deepToString(ticTacToe.displayBoard()));
//        assertEquals( GameStatus.WIN, ticTacToe.getGameStatus());
//    }
//    @Test
//    public void playerOCanWinAtTheThirdRowTest(){
////        Player[] player = ticTacToe.getPlayer();
//        TicTacSigns[][] expected = {{Empty,Empty, Empty},{Empty, Empty, Empty},
//                {X, X, X}};
////        ticTacToe.play(7, player[);
////        ticTacToe.play(8, player[0]);
////        ticTacToe.play(9, player[0]);
//        ticTacToe.horizontalWin();
//        assertArrayEquals(expected, ticTacToe.displayBoard());
//        assertEquals( GameStatus.WIN, ticTacToe.getGameStatus());
//    }
//    @Test
//    public void gameThrowsAnExceptionWhenTheNumbersGreaterThanAreInputtedTest(){
////        Player[] player = ticTacToe.getPlayer();
//        TicTacSigns[][] expected = {{O,Empty, Empty},{Empty, Empty, Empty},
//                {Empty, Empty, Empty}};
//
//        int positionToPlay = 10;
//        assertThrows(InvalidNumberException.class, () ->ticTacToe.play(positionToPlay, player));
//    }
//     @Test
//    public void gameThrowsAnExceptionWhenTheNumbersLessThanZeroAreInputtedTest(){
////        Player[] player = ticTacToe.getPlayer();
//        TicTacSigns[][] expected = {{X,Empty, Empty},{Empty, Empty, Empty},
//                {Empty, Empty, Empty}};
////         ticTacToe.play(1, player[0]);
//         assertArrayEquals(expected, ticTacToe.displayBoard());
//        int positionToPlay = -7;
////        assertThrows(InvalidNumberException.class, () ->ticTacToe.play(positionToPlay, player[0]));
//    }
//    @Test
//    public void playerXCanWinVerticallyAtFirstColumnTest(){
////        Player[] player = ticTacToe.getPlayer();
//        TicTacSigns[][] expected = {{X,Empty, Empty},{X, Empty, Empty},
//                {X, Empty, Empty}};
////        ticTacToe.play(1, player[0]);
////        ticTacToe.play(4, player[0]);
////        ticTacToe.play(7, player[0]);
//        ticTacToe.verticalWin();
//        assertArrayEquals(expected, ticTacToe.displayBoard());
//    }
//    @Test
//    public void player0CanWinVerticallyAtFirstColumnTest(){
////        Player[] player = ticTacToe.getPlayer();
//        TicTacSigns[][] expected = {{O,Empty, Empty},{O, Empty, Empty},
//                {O, Empty, Empty}};
////        ticTacToe.play(1, player[1]);
////        ticTacToe.play(4, player[1]);
////        ticTacToe.play(7, player[1]);
//        ticTacToe.verticalWin();
//        assertArrayEquals(expected, ticTacToe.displayBoard());
//    }
//    @Test
//    public void playerCanWinVerticallyAtSecondColumnTest(){
////        Player[] player = ticTacToe.getPlayer();
//        TicTacSigns[][] expected = {{Empty,O, Empty},{Empty, O, Empty},
//                {Empty, O, Empty}};
////        ticTacToe.play(2, player[1]);
////        ticTacToe.play(5, player[1]);
////        ticTacToe.play(8, player[1]);
//        ticTacToe.verticalWin();
//        assertArrayEquals(expected, ticTacToe.displayBoard());
//    }
//    @Test
//    public void playerCanWinVerticallyAtThirdColumnTest(){
////        Player[] player = ticTacToe.getPlayer();
//        TicTacSigns[][] expected = {{Empty,Empty, X},{Empty, Empty, X},
//                {Empty, Empty, X}};
////        ticTacToe.play(3, player[0]);
////        ticTacToe.play(6, player[0]);
////        ticTacToe.play(9, player[0]);
////        ticTacToe.verticalWin();
//        assertArrayEquals(expected, ticTacToe.displayBoard());
//    }
//    @Test
//    public void playerCanWinDiagonallyFromTheTopLeftToTheLastDownTest(){
////        Player[] player = ticTacToe.getPlayer();
//        TicTacSigns[][] expected = {{Empty,Empty, O},{Empty, O, Empty},
//                {O, Empty, Empty}};
////        ticTacToe.play(3, player[1]);
////        ticTacToe.play(5, player[1]);
////        ticTacToe.play(7, player[1]);
//        ticTacToe.diagonalWin();
//        assertArrayEquals(expected, ticTacToe.displayBoard());
//    }
//     @Test
//    public void GameCanBeDrawnTest(){
////        Player[] player = ticTacToe.getPlayer();
//        TicTacSigns[][] expected = {{O,X, X},{X, X, O},
//                {X, O, O}};
////        ticTacToe.play(1, player[1]);
////        ticTacToe.play(2, player[0]);
////        ticTacToe.play(3, player[0]);
////        ticTacToe.play(4, player[0]);
////        ticTacToe.play(5, player[0]);
////        ticTacToe.play(6, player[1]);
////        ticTacToe.play(7, player[0]);
////        ticTacToe.play(8, player[1]);
////        ticTacToe.play(9, player[1]);
//         ticTacToe.draw();
//         System.out.println(ticTacToe.getGameStatus());
//        assertArrayEquals(expected, ticTacToe.displayBoard());
//        assertEquals(GameStatus.DRAW, ticTacToe.getGameStatus());
//    }
//
//
//}