package practise;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int count = 0;
         int numberSquare = 1;
//         int square = 1;
        while(count < 100){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            numberSquare = number * number;
            count++;
            System.out.println(numberSquare);
        }
//        System.out.println(numberSquare);
    }
}
