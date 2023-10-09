package arrayAssignments;

import javax.management.StringValueExp;
import java.util.Arrays;
import java.util.Objects;

import static java.lang.String.*;

public class CreditCardValidator {
    public static void main(String[] args) {
        String[] cardNumber = {"4","3","8","8","5","7","6","0","1","8","4","0","2","6","2","6"};
        calculateCardValidate(cardNumber);
    }
    public static String[] creditCardNumber(String[] cardNumber) {
        cardNumber = new String[cardNumber.length];
        String [] cardNumberValue = null;
        int count ;

        for (count = 0; count < cardNumber.length; count++) {
            if(cardNumber.length >= 13 && cardNumber.length <= 16){
                cardNumberValue = new String[]{Arrays.toString(cardNumber)};
            }
            else{
                System.out.println("Invalid length");
            }
            if (count - cardNumber.length == 4){
                System.out.println("The card is a Visa card");
            }
            else if(count - cardNumber.length == 5){
                System.out.println("The card is a MasterCard");
            } else if (count - cardNumber.length == 37) {
                System.out.println("The card is an American Express Card");
            } else if (count - cardNumber.length == 6) {
                System.out.println("Discovery card");
            }
        }

        return cardNumberValue;
    }
    public static boolean calculateCardValidate(String[] cardNumber){
        cardNumber = new String[cardNumber.length];
        int oddMultiply ;
        int evenAdd = 0;
        int oddAdd = 0;
        boolean valid= true;


        for(int count = cardNumber.length-2; count > 1; count = count -2) {
            oddMultiply = count * 2;
            int digitAdd ;
            if (oddMultiply > 9) {
                int digitOne = oddMultiply % 10;
                int oddDivide = oddMultiply / 10;
                int digitTwo = oddDivide % 10;
                digitAdd = digitOne + digitTwo;
                oddAdd = digitAdd + count;
            }
            else{
                oddAdd += count;
            }
        }
            for (int counter = cardNumber.length-1; counter > 2; counter = counter - 2) {
                evenAdd += counter;
            }
            int validateAdd = oddAdd + evenAdd;
        System.out.println("The even add is "+evenAdd);
            System.out.println("The validate add is "+validateAdd);
            if(validateAdd % 10 == 0){
                return valid;
            }

        return valid;

    }
}
