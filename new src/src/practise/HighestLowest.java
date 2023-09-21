package practise;

import java.util.Scanner;

public class HighestLowest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int number = scanner.nextInt();
        int highest = 0;
        int lowest = number;
        for (int count = 1; count <= 3 ; count++) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            if (number > highest) {
                highest = number;
            }
            else if(number < lowest) {
                lowest = number;
            }
        }
        System.out.printf("The highest number is %d\nThe lowest number is %d", highest, lowest );
    }
}
