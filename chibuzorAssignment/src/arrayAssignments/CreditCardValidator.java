package arrayAssignments;

import javax.management.StringValueExp;
import java.util.Arrays;
import java.util.Objects;

import static java.lang.String.*;

public class CreditCardValidator {
    public static void main(String[] args) {
        String[] cardNumber = {"4","3","8","8","5","7","6","0","1","8","4","1","0","7","0","7"};
        System.out.println(calculateCardValidate(cardNumber));
        System.out.println(creditCardNumber(cardNumber));
    }
    public static String creditCardNumber(String[] cardNumber) {
        String result = "";
            if(cardNumber.length >= 13 && cardNumber.length <= 16){
                if (Integer.parseInt(cardNumber[0]) == 4){
                    result = "Visa card";
                }
                else if(Integer.parseInt(cardNumber[0]) == 5){
                    result = "MasterCard";
                } else if (Integer.parseInt(cardNumber[0]) == 3 && Integer.parseInt(cardNumber[1]) == 7) {
                    result = "American Express Card";
                } else if (Integer.parseInt(cardNumber[0]) == 6) {
                    result = "Discovery card";
                }
            }
            else{
                result = "Invalid length";
            }
        return result;
    }
    public static String calculateCardValidate(String[] cardNumber){
        int oddMultiply ;
        int evenAdd = 0;
        int oddAdd = 0;

        int oddAddOne = 0;
        int oddAddTwo = 0;
        int digitAdd;
        for(int count = cardNumber.length-2; count >= 0; count = count -2) {
            oddMultiply = Integer.parseInt(cardNumber[count]) * 2;
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
            for (int counter = cardNumber.length-1; counter >= 0; counter = counter - 2) {
                evenAdd += Integer.parseInt(cardNumber[counter]);
            }
            int validateAdd = oddAdd + evenAdd;
            if(validateAdd % 10 == 0){
                return "valid";
            }
            else {
                return "Invalid";
            }
    }

}
