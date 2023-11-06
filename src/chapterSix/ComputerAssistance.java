package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistance {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        boolean keepGoing = true;
        while(keepGoing) {
            display();
            System.out.println(message);
            display();
            int number1 = createNumbers();
            int number2 = createNumbers();

            String question = generateQuestion(number1, number2) ;

            int answer = check.nextInt();
            if (answer != number1 * number2) {
                question = generateQuestion(number1,number2);
                answer = check.nextInt();
            }
            else {
                System.out.println("do you wish to continue playing: ");
                String continuePlaying = check.nextLine();
                String continuePlay = continuePlaying.toLowerCase();
                if (continuePlay.equals("no")) {
                    keepGoing = false;
                }
            }
        }


    }
    public static final SecureRandom random = new SecureRandom();
    public static String message = "HELLO";
    public static String correctAnswerMessage = "Very Good!";
//    public static int
    public static int createNumbers(){
        int number = random.nextInt(1,10);
        return number;
    }
    public static String generateQuestion(int number1,int number2){
        number1 = createNumbers();
        number2 = createNumbers();
        int correctAnswer = number2 * number1;
        String result = "How much is " + number1 + "times "+ number2 + " ?" ;
        System.out.println(result);
        return result;
    }
    public static int collectAnswer(int number1, int number2){
        number1 = createNumbers();
        number2 = createNumbers();
         return number1 * number2;
    }
    public static void display(){
        System.out.println("=".repeat(10));
    }
}