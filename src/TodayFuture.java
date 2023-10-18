package practise;

import java.util.Scanner;

public class TodayFuture {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int today = keyboardInput.nextInt();
        System.out.println("Enter the number of day elapsed: ");
        int elapsedDay = keyboardInput.nextInt();
//        int futureDay = today + elapsedDay % 7;
        switch (today) {
            case 0 -> System.out.print("The day is Sunday ");
            case 1 -> System.out.print("The day is Monday ");
            case 2 -> System.out.print("The day is Tuesday ");
            case 3 -> System.out.print("The day is Wednesday ");
            case 4 -> System.out.print("The day is Thursday ");
            case 5 -> System.out.print("The day is Friday ");
            case 6 -> System.out.print("The day is Saturday ");
        }
        int futureDay = today + elapsedDay % 7;
        switch (futureDay) {
            case 0 -> System.out.print("and the future day is Sunday ");
            case 1 -> System.out.print("and the future day is Monday ");
            case 2 -> System.out.print("and the future day is Tuesday ");
            case 3 -> System.out.print(" and the future day is Wednesday ");
            case 4 -> System.out.print(" and the future day is Thursday ");
            case 5 -> System.out.print("and the future day is Friday ");
            case 6 -> System.out.print("and the future day is Saturday ");
        }
    }
}

