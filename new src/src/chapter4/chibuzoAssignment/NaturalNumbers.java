package chibuzoAssignment;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int naturalNumber = 0;
//        int sumNaturalNumber = 0;
        int count = 1;
        while(count <= 10){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            if (number >= 1){
              naturalNumber  = naturalNumber + number;
                count++;
            }
        }
        System.out.println("The sum of the first ten natual number is "+naturalNumber);
    }
}
