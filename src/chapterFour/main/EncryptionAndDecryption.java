package chapterFour.main;

import java.util.Scanner;

public class EncryptionAndDecryption {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter the number to encrypt: ");
        String fourDigitNumber = check.nextLine();
        String answer = encryption(fourDigitNumber);
        System.out.printf("The encrypted number is %s", answer);
        System.out.println("\nEnter the number to decrypt: ");
        String encryptedNumberToDecrypt = check.nextLine();
        String decryptedNumber = decryption(encryptedNumberToDecrypt);
        System.out.printf("The decrypted number is %s",decryptedNumber);

    }
    public static String encryption(String fourDigitNumber) {
        int newFirstDigit = 0;
        int newSecondDigit = 0;
        int newThirdDigit = 0;
        int newFourthDigit = 0;
        if(Integer.parseInt(fourDigitNumber) > 999 && Integer.parseInt(fourDigitNumber) <= 9999) {
            int firstDigit = Integer.parseInt(String.valueOf(fourDigitNumber.charAt(0)));
            int secondDigit = Integer.parseInt(String.valueOf(fourDigitNumber.charAt(1)));
            int thirdDigit = Integer.parseInt(String.valueOf(fourDigitNumber.charAt(2)));
            int fourthDigit = Integer.parseInt(String.valueOf(fourDigitNumber.charAt(3)));

            newFirstDigit = (firstDigit + 7) % 10;
            newSecondDigit = (secondDigit + 7) % 10;
            newThirdDigit = (thirdDigit + 7) % 10;
            newFourthDigit = (fourthDigit + 7) % 10;
        }

        else {
            System.out.println("Invalid number!");
        }
        return newThirdDigit+""+newFourthDigit+""+newFirstDigit+""+newSecondDigit;

    }
    public static String decryption(String fourDigitNumber){
       int newFirstDigit = 0;
       int newSecondDigit = 0;
       int newThirdDigit = 0;
       int newFourthDigit = 0;
       if(Integer.parseInt(fourDigitNumber) > 999 && Integer.parseInt(fourDigitNumber) <= 9999){
           int digitOne = Integer.parseInt(String.valueOf(fourDigitNumber.charAt(0)));
           int digitTwo = Integer.parseInt(String.valueOf(fourDigitNumber.charAt(1)));
           int digitThree = Integer.parseInt(String.valueOf(fourDigitNumber.charAt(2)));
           int digitFour = Integer.parseInt(String.valueOf(fourDigitNumber.charAt(3)));

           newSecondDigit = digitFour;
           newFourthDigit = digitTwo;
           newFirstDigit = digitThree;
           newThirdDigit = digitOne;


           newFirstDigit = (digitOne +10) - 7;
           newSecondDigit = (digitTwo + 10) - 7;
           newThirdDigit = (digitThree + 10) - 7;
           newFourthDigit = (digitFour + 10) - 7;
       }
       else{
           System.out.println("Invalid number");
       }
       return newThirdDigit+""+newFourthDigit+""+newFirstDigit+""+newSecondDigit;
    }

}