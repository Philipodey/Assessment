package test;

public class Multiplication {
    public static int multiply(int firstNumber, int secondNumber) {
        int product = 0;
            if (secondNumber > 0) {
                for (int count = 1; count <= secondNumber; count++) {
                    product = product + firstNumber;
                }
            } else{
                for (int count = 1; count <= firstNumber; count++) {
                    product = product + secondNumber;
                }
            }
            if (firstNumber < 0 && secondNumber < 0){
                for (int count = 1; count <= -secondNumber; count++) {
                    product = product +(-firstNumber);
                }
            }
            return product;
        }
    }
