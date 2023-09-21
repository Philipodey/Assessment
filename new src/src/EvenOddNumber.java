import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number1 = scanner.nextInt();

        int remainder = number1 % 2;

        if(remainder == 1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
}
