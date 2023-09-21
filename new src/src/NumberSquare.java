import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int square = number * number;
        System.out.printf("The square of %d is %d", number, square);
    }
}