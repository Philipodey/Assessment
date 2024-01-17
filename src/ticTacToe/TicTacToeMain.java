package ticTacToe;

import ticTacToe.constantClass.TicTacSigns;
import ticTacToe.exceptions.InvalidNumberException;
import ticTacToe.exceptions.TicTacToeException;
import ticTacToe.tictactoeClass.Player;
import ticTacToe.tictactoeClass.TicTacToe;

import java.util.Scanner;


public class TicTacToeMain {
   private static TicTacToe ticTacToe;
   private static Player player;
//   private static B
//   private static TicTacSigns

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        System.out.printf("""
                %s
                1 -> play with computer
                2 -> multiplayer
                %s
                """, "=".repeat(30), "=".repeat(30));
        switch (input("choose an option: ")){
            case "1" -> playWithComputer();
            case "2" -> multiplayer();
        }
    }

    private static void multiplayer() {

    }

    private static void playWithComputer() {
        String playerSign = input("choose the sign you want to play with? ").toUpperCase();
//        while(!playerSign.matches("A+-z+")){ input("choose the sign you want to play with? ");}
        String computerSign = input("choose the computer sign to play with? ").toUpperCase();
//        while(!playerSign.matches("A+-z+")){ input("choose the computer sign to play with? ");}
        try{
          TicTacSigns  computerSignature = player.chooseSign(computerSign);
            TicTacSigns playerSignature = player.chooseSign(playerSign);
//            while(!boardIsFull(printBoard())){
                String playerPlay = input("Where would you like to play: ");
                playerTurn(playerPlay, playerSignature);
                printBoard();
//            }
        }catch (TicTacToeException ticTacToeException){
            System.out.println("wrong place to play");
        }
//        finally {
//
//        }

    }

    private static void playerTurn(String input, TicTacSigns playerSignature) {
        try{
            player.play(input, playerSignature);
        }catch (InvalidNumberException numberException){numberException.getMessage();}

    }
    private static boolean boardIsFull(TicTacSigns[][] board){
       try{
           return ticTacToe.boardFull(board);
       }catch(TicTacToeException exception){
           System.out.println("board is not full !!!!");
       }
           return ticTacToe.boardFull(board);
    }

    private static TicTacSigns[][] printBoard() {
       return player.boards();
    }

    //    public void plays(){
//        Player player = new Player();
//        String firstPlayerName = input("What is your name: ");
//        String firstPlayerSign = input("""
//                    ====================================
//                    Choose any letter you want to play with
//                    1 -> X
//                    2 -> O
//                    Press any 4 to go back to main menu
//                    ====================================
//                    """);
//        while(!firstPlayerSign.matches(".*\\d+")) {
//           firstPlayerSign = input("""
//                    ====================================
//                    Choose any letter you want to play with
//                    1 -> X
//                    2 -> O
//                    Press any 4 to go back to main menu
//                    ====================================
//                    """);
//        }
//        int PlayerOneSign = Integer.parseInt(input(firstPlayerSign));
////        TicTacSigns player1 =
////        String secondPlayer = input("What is your name: ");
//        int secondPlayerSign = Integer.parseInt(input("Choose what you choose to be 0 or 1: "));
//
//    }
    public static String input(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();

    }
}
