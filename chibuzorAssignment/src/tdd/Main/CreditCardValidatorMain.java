package tdd.Main;

import java.util.Arrays;
import java.util.Scanner;

import static arrayAssignments.CreditCardValidator.calculateCardValidate;
import static arrayAssignments.CreditCardValidator.creditCardNumber;

public class CreditCardValidatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cardNumber = "43885760184033";
        System.out.println("***************************************");
        System.out.printf("\n****Credit Card Number: %s%n",cardNumber);
        System.out.printf("\n****Credit Card Number: %s",creditCardNumber(cardNumber));
        System.out.printf("\n****Credit Card Digit Length: %d",cardNumber.length());
        System.out.printf("\n****Credit Card Validity Status: %s",calculateCardValidate(cardNumber));
        System.out.println("\n*****************************************");
    }

}
