import java.util.Scanner;

public class SeperateDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ten digit number: ");
        int number = scanner.nextInt();

        int digit1 = number / 1000000000;
        int digit2 = number / 1000000000 % 10;
        int digit3 = number / 100000000 % 10;
        int digit4 = number / 10000000 % 10;
        int digit5 = number / 1000000 % 10;
        int digit6 = number / 100000 % 10;
        int digit7 = number / 10000 % 10;
        int digit8 = number / 1000 % 10;
        int digit9 = number / 100 % 10;
        int digit10 = number / 10 % 10;
        int digit11 = number / 1 % 10;

        System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d", digit1, digit2, digit3, digit4, digit5, digit6, digit7, digit8, digit9, digit10);

    }
}
