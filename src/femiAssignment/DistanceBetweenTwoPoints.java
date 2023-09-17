package femiAssignment;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        int slope;
        slope = input("Enter the coordinate: ");
    }

    public static int input(String prompt) {
            Scanner scanner = new Scanner(System.in);

            int slope = 0;
            System.out.println(prompt);
            int firstXCoordinate = scanner.nextInt();
            System.out.println(prompt);
            int firstYCoordinate = scanner.nextInt();
            int gradientOne = -(firstXCoordinate) / firstYCoordinate;
            System.out.println(prompt);
            int secondXCoordinate = scanner.nextInt();
            System.out.println(prompt);
            int secondYCoordinate = scanner.nextInt();
            int gradientTwo = -(secondXCoordinate) / secondYCoordinate;
            slope = gradientOne * gradientTwo;
            if (slope > 0) {
                System.out.printf("The slope is between %d & %d is %d and is not located on a line perpendicular to an axis", gradientOne, gradientTwo, slope);
            }
            if (slope < 0) {
                System.out.printf("The slope is between %d & %d is %d and is located on a line perpendicular to an axis", gradientOne, gradientTwo, slope);
            }

            return slope;
    }

}