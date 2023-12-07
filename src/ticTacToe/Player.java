package ticTacToe;

import static ticTacToe.TicTacSigns.*;

public class Player {
    private TicTacSigns ticTacSigns;

    public Player(TicTacSigns ticTacSigns) {
        this.ticTacSigns = ticTacSigns;
    }


    public String setName(String playerName) {

        return playerName;
    }

    public void setTicTacSigns(TicTacSigns signs) {
        ticTacSigns = signs;
    }
    public TicTacSigns getTicTacSigns(){
        return ticTacSigns;
    }



    public void play(Player player, int position) {
    }
}
