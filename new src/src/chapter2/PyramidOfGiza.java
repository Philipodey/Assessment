package chapter2;

import java.util.Scanner;

public class PyramidOfGiza {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Estimated number of stones: ");
        int numberOfStones = scanner.nextInt();

        System.out.print("Average weight of each stone: ");
        float averageWeightOfStone = scanner.nextFloat();

        System.out.print("Number of years taken to build:");
        int numberOfYears = scanner.nextInt();

        int day = 24;
        int hour = 60;
        int year = 365;
        int yearsTaken = year * numberOfYears;
        int hoursTaken = hour * numberOfYears;
        int daysTaken = day * numberOfYears;

        float howMuchByWeight = numberOfYears * averageWeightOfStone;
        float yearsTakenToBuild = howMuchByWeight / yearsTaken;
        float hoursTakenToBuild = howMuchByWeight / hoursTaken;
        float daysTakenToBuild = howMuchByWeight / daysTaken;

        System.out.printf("%f is the weight by year",howMuchByWeight);
        System.out.printf("%f is the year taken to build",yearsTakenToBuild);
        System.out.printf("%f is the hours taken to build",hoursTakenToBuild);
        System.out.printf("%f is the days taken to build",daysTakenToBuild);


    }
}
