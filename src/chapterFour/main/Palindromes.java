package chapterFour.main;

public class Palindromes {
    public void palindromes(int anotherNumber){
        int reverse = anotherNumber;
        int turnNumber = 0;
        int digit = 0;
        int count = 0;
        if (anotherNumber > 9999) {
            while (anotherNumber != 0) {
                digit = anotherNumber % 10;
                turnNumber = turnNumber * 10 + digit;
                anotherNumber = anotherNumber / 10;
                count++;
            }
            if (reverse == turnNumber) {
                System.out.println("It is a palindrome");
            }
            else{
                System.out.println("It is not a palindrome");
            }
        }
    }
    public void palindrome(int number) {
        int reverse = number;
        int turnNumber = 0;
        int digit = 0;
        int count = 0;
        if (number > 9999) {
            while (number != 0) {
                digit = number % 10;
                turnNumber = turnNumber * 10 + digit;
                number = number / 10;
                count++;
            }
            if (reverse == turnNumber) {
                System.out.println("It is a palindrome");
            }
            else{
                System.out.println("It is not a palindrome");
            }
        ;
        }
    }
}