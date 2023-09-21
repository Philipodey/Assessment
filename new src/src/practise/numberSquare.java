package practise;

import java.util.Scanner;

public class numberSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squareNumber = 1;
        for (int count = 0; count < 5; count++) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            squareNumber = number * number;
        }
    }
}
