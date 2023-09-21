package practise;

import java.util.Scanner;

public class TwelveMonthOfTheYear {
    public static void monthOfTheYear(){
        Scanner scanner = new Scanner(System.in);



        System.out.println("""
                               Button 1: January
                               Button 2: Febuary
                               Button 3: March
                               Button 4: April
                               Button 5: May
                               Button 6: June
                               Button 7: July
                               Button 8: August
                               Button 9: September
                               Button 10: October
                               Button 11: November
                               Button 12: December
                """);
            System.out.print("Press any button: ");
        int months = scanner.nextInt();

        switch(months) {
            case 1:
                System.out.println("The month is January");
                break;
            case 2:
                System.out.println("The month is Febuary");
                break;
            case 3:
                System.out.println("The month is March");
                break;
            case 4:
                System.out.println("The month is April");
                break;
            case 5:
                System.out.println("The month Is May");
                break;
            case 6:
                System.out.println("The month is June");
                break;
            case 7:
                System.out.println("The month is July");
                break;
            case 8:
                System.out.println("The month is August");
                break;
            case 9:
                System.out.println("The month is September");
                break;
            case 10:
                System.out.println("The month is October");
                break;
            case 11:
                System.out.println("The month is November");
                break;
            case 12:
                System.out.println("The month is December");
                break;

            default:
                System.out.println("You entered a wrong number!");break;
        }

    }
}
