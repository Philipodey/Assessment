package chapterSix;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        System.out.println("Enter the character to print: ");
        Scanner input = new Scanner(System.in);
        char fill = input.next().charAt(0);
        squareOfAsterisks(5,fill);
    }
    public static void squareOfAsterisks(int side,char fillCharacter){
        for (int counter = 0; counter < side; counter++) {
            for (int count = 0; count < side; count++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
}
