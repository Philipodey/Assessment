import java.util.Scanner;

public class RaiseToPower {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        int raisedToPower = 1;
        for (int count = 1; count <= num2; count++) {
            raisedToPower = raisedToPower * num1;
//            System.out.println(raisedToPower);
        }
        System.out.println(raisedToPower);
    }
}
