package practise;

import java.util.Scanner;

public class TodayFuture {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int today = keyboardInput.nextInt();
        System.out.println("Enter the number of day elapsed: ");
        int elapsedDay = keyboardInput.nextInt();
        int futureDay = today + elapsedDay % 7;
        switch(today){
            case 0:
                System.out.print("The day is Sunday ");break;
            case 1:
                System.out.print("The day is Monday ");break;
            case 2:
                System.out.print("The day is Tuesday ");break;
            case 3:
                System.out.print("The day is Wednesday ");break;
            case 4:
                System.out.print("The day is Thursday ");break;
            case 5:
                System.out.print("The day is Friday ");break;
            case 6:
                System.out.print("The day is Saturday ");break;
        }
        switch(futureDay) {
            case 0:
                System.out.print("and the future day is Sunday ");
                break;
            case 1:
                System.out.print("and the future day is Monday ");
                break;
            case 2:
                System.out.print("and the future day is Tuesday ");
                break;
            case 3:
                System.out.print(" and the future day is Wednesday ");
                break;
            case 4:
                System.out.print(" and the future day is Thursday ");
                break;
            case 5:
                System.out.print("and the future day is Friday ");
                break;
            case 6:
                System.out.print("and the future day is Saturday ");
                break;
        }
    }
}

