package ticTacToe;

import static ticTacToe.GameStatus.*;
import static ticTacToe.TicTacSigns.X;

public class TicTacToe {

    Board board;
    Player[] player = new Player[2];
    TicTacSigns [][] game = new TicTacSigns[3][3];
    GameStatus gameStatus ;

    public TicTacToe(){
        board = new Board();
        player[0] = new Player(X);
        player[1] = new Player(TicTacSigns.O);
    }

    public Player[] getPlayer() {
        return player;
    }

    public void play(int move, Player player){
        board.playerMoves(player, move);
    }
    public TicTacSigns[][] displayBoard(){
        return board.displayBoard();
    }

    public void verticalWin() {
        GameStatus status;
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
            }
            if (game[0][i] == X){
                status = WIN;
            }
            status = DRAW;
        }
    }
}
