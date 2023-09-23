package chapterFour.test;

import java.util.Scanner;

public class GasMileageTest {
    public static void main(String[] args) {
//        calculate and display the miles driven per gallon
//        initialize variables
//        initialize the miles driven
//        initialize the gallons used
//        obtain miles driven and gallons used until the driver wishes to stop
//        calculate thr miles per gallon for each trip
//        print the miles per gallon obtained from each trip up to the recent trip
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("\nPlease enter the miles driven and enter -1 to quit: ");
        int milesDriven = scanner.nextInt();
        System.out.println("Please enter the gallons used and enter -1 to quit: ");
        int gallons = scanner.nextInt();
        double milesPerGallon = (double) milesDriven / gallons;
        System.out.printf("The miles per gallon for each trip is %.2f",milesPerGallon);

        while (milesDriven != -1 && gallons != -1){
            System.out.println("\nPlease enter the miles driven and enter -1 to quit: ");
            milesDriven = scanner.nextInt();
            System.out.println("Please enter the gallon used and enter -1 to quit: ");
            gallons = scanner.nextInt();

            milesPerGallon = (double)milesDriven / gallons;
            System.out.printf("The miles per gallon for each trip is %.2f",milesPerGallon);
        }






    }
}


