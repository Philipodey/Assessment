import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();
        int remainder = num % 5;

        if(num != 0 && remainder == 0 ){
            System.out.println(remainder);
        } else {
            System.out.println("");
        }
    }
}
