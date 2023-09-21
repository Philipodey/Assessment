package chibuzoAssignment;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int numberOne;
        int numberTwo;
        int sum = 0;
        boolean keepGoing = true;
        do{
            System.out.println("Enter the first number: ");
             numberOne = keyboardInput.nextInt();
            System.out.println("Enter the second number: ");
             numberTwo = keyboardInput.nextInt();
            sum = numberOne + numberTwo;
            System.out.printf("The sum of %d and %d numbers is %d\n", numberOne ,numberTwo , sum);
            keyboardInput.nextLine();
            System.out.println("Do you want to end the program(yes or no): ");
            String stopper = keyboardInput.nextLine();

            if(stopper.equals("no")||stopper.equals("NO")||stopper.equals("No")){
                keepGoing = false;
            }


        } while (keepGoing);
    }
}
