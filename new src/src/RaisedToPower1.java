import java.util.Scanner;

public class RaisedToPower1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int raisedToPower = 1;
       int count = 1;
       while (count <= firstNumber){
           raisedToPower = raisedToPower * secondNumber;
           count++;
       }
        System.out.println(raisedToPower);
    }
}
