package ticTacToe;

import static ticTacToe.GameStatus.*;
import static ticTacToe.TicTacSigns.O;
import static ticTacToe.TicTacSigns.X;

public class TicTacToe {

    Board board = new Board();
    Player[] player = new Player[2];

    GameStatus gameStatus = DRAW;

    public TicTacToe(){
        player[0] = new Player(X);
        player[1] = new Player(O);
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

    public void horizontalWin() {
        for (int i = 0; i < board.displayBoard().length; i++) {
            if (horizontalPlay(i)) break;

        }

    }

    private boolean horizontalPlay(int i) {
        if (board.displayBoard()[0][i] == X) {gameStatus = WIN;return true;}
        if (board.displayBoard()[0][i] == O){gameStatus = WIN;return true;}
        if (board.displayBoard()[1][i] == X){ gameStatus = WIN;return true;}
        if (board.displayBoard()[1][i] == O){ gameStatus = WIN;return true;}
        if (board.displayBoard()[2][i] == O){ gameStatus = WIN;return true;}
        if (board.displayBoard()[2][i] == X){ gameStatus = WIN;return true;}
         return true;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void verticalWin() {
        for (int i = 0; i < displayBoard().length; i++) {
            if (verticalWin(i)) break;

        }
    }

    private boolean verticalWin(int i) {
        if (board.displayBoard()[i][0] == X){ gameStatus = WIN; return true;}
        if (board.displayBoard()[i][0] == O){ gameStatus = WIN;return true;}
        if (board.displayBoard()[i][1] == X){ gameStatus = WIN; return true;}
        if (board.displayBoard()[i][1] == O){ gameStatus = WIN;return true;}
        if (board.displayBoard()[i][2] == O){ gameStatus = WIN;return true;}
        if (board.displayBoard()[i][2] == X){ gameStatus = WIN;return true;}
        return true;
    }

    public void diagonalWin() {
        diagonalPlay();
    }

    private boolean diagonalPlay() {
        if (board.displayBoard()[0][0] == X && board.displayBoard()[1][1] ==  X && board.displayBoard()[2][2] == X){ gameStatus = WIN; }
        if (board.displayBoard()[0][2] == O && board.displayBoard()[1][1] ==  O && board.displayBoard()[2][0] == O){ gameStatus = WIN; }
        if (board.displayBoard()[0][0] == O && board.displayBoard()[1][1] ==  O && board.displayBoard()[2][2] == O){ gameStatus = WIN; }
        if (board.displayBoard()[0][2] == X && board.displayBoard()[1][1] ==  X && board.displayBoard()[2][0] == X){ gameStatus = WIN; }
        return true;
    }

    public void draw(){
        for (int i = 0; i < board.displayBoard().length; i++) {
            if (!(verticalWin(i) && horizontalPlay(i) && !diagonalPlay())){
                gameStatus = DRAW;
            }
        }
    }
}
