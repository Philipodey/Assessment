import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int remainder = number % 2;
        if (remainder == 0) {
            System.out.print("The number is even");
        } else if (remainder == 1) {
            System.out.print("The number is odd");
        }
    }

}