package Assignment;

public class Game {
    public static void main(String[] args) {
        char [][] game = new char [3][3];
        game [0][0] = 'x';
        game [0][1] = 'o';
        game [0][2] = 'x';
        game [1][0] = 'x';
        game [1][1] = 'x';
        game [1][2] = 'o';
        game [2][0] = 'o';
        game [2][1] = 'x';
        game [2][2] = 'x';

        for (int count = 0; count < game.length; count++) {
            for (int index = 0; index < game[count].length; index++) {
                System.out.print(game[count][index]+"| \t");
            }
            System.out.println(" ");
        }

    }
}
