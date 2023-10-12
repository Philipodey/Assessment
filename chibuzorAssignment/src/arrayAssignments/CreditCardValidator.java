package arrayAssignments;

import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        String cardNumber = input("Enter card number: ");
        System.out.printf("""
                              *********************************************
                              ***Credit Card Type: %s
                              ***Credit Card Number: %s
                              ***Credit Card Digit Length: %d
                              ***Credit Card Validity: %s
                              *********************************************
                """,creditCardNumber(cardNumber), cardNumber, cardNumber.length(), calculateCardValidate(cardNumber));
    }
    public static String creditCardNumber(String cardNumber) {
            String result = "";
        for (int count = 0; count < cardNumber.length(); count++) {

                int index = Integer.parseInt(String.valueOf(cardNumber.charAt(0)));
                int index1 = Integer.parseInt(String.valueOf(cardNumber.charAt(1)));

            if (cardNumber.length() >= 13 && cardNumber.length() <= 16) {
                if (index == 4) {
                    result = "Visa card";
                } else if (index == 5) {
                    result = "MasterCard";
                } else if (index == 3 && index1 == 7) {
                    result = "American Express Card";
                } else if (index == 6) {
                    result = "Discovery card";
                }
                else{
                    while(true){
                        cardNumber = input("Enter card number: ");
                    }
                }
            } else {
                result = "Invalid length";
            }
        }
        return result;
    }
    public static String calculateCardValidate(String cardNumber){
        int oddMultiply ;
        int evenAdd = 0;
        int oddAdd = 0;

        int oddAddOne = 0;
        int oddAddTwo = 0;
        int digitAdd;
        for(int count = cardNumber.length()-2; count >= 0; count = count -2) {
            oddMultiply = Integer.parseInt(String.valueOf(count)) * 2;
            if (oddMultiply > 9) {
                int digitOne = oddMultiply % 10;
                int oddDivide = oddMultiply / 10;
                digitAdd = digitOne + oddDivide;
                oddAddOne += digitAdd ;
            }
            else {
                oddAddTwo += oddMultiply;
            }

        }
         oddAdd = oddAddOne + oddAddTwo;
            for (int counter = cardNumber.length()-1; counter >= 0; counter = counter - 2) {
                evenAdd += Integer.parseInt(String.valueOf(counter));
            }
            int validateAdd = oddAdd + evenAdd;
            if(validateAdd % 10 == 0){
                return "valid";
            }
            else {
                return "Invalid";
            }
    }
    public static String input(String prompt){
        Scanner check = new Scanner(System.in);
        System.out.println(prompt);
        return check.nextLine();
    }

}
