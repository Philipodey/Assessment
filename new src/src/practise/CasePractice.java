package practise;

import java.util.Scanner;

public class CasePractice {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print(""" 
                1 -> On the first day of Christmas, my true love sent to me;
                2 -> On the second day of Christmas, my true love sent to me;
                3 -> On the third day of Christmas, my true love sent to me;
                                             
                              """);
        int userInput = keyboardInput.nextInt();

        switch (userInput) {
            case 1 -> System.out.println("A patridge in a pair tree ");
            case 2 -> System.out.println("<two turtle dove and a patridge in a pair tree");
            case 3 -> System.out.println("<Three French hen, two turtle dove and a patridge in a pair tree");
            default -> System.out.println("No try that nonsense with me");
        }
        switch (userInput) {
            case 1:
                System.out.println("English");
                break;

            case 3:
                System.out.println("Yala");
                break;

            case 2:
                System.out.println("pidgin");
                System.out.println("You want speak pidgin ?Yes or No?");
                int efik = keyboardInput.nextInt();
                switch (efik) {
                    case 2:
                        System.out.println("pidgin mode on");
                        break;

                    case 1:
                        System.out.println("pidgin mode off");
                        break;
                    default:
                        System.out.println("You be werey");
                        break;
                }
                break;


        }
    }
}