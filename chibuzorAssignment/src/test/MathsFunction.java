package test;


public class MathsFunction {

    public static boolean evenOdd(int number) {

        boolean even = true;
        boolean odd = false;

        if (number % 2 == 0) {
            return even;
        }
        else{
            return odd;
        }
    }

    public static boolean primeNumber(int number) {
        boolean prime = true;
        boolean notPrime = false;
        int factor = 0;
        for (int count = 1; count <= number; count++) {
           if(number % count == 0 ){
               factor++;
           }
        }
        if(factor <= 2){
            return prime;
        }
        else {
            return notPrime;
        }
    }

    public static int positiveDifference(int firstNumber, int secondNumber) {
        int positiveMinus = firstNumber - secondNumber;
        int negativeMinus = -(firstNumber) -(-secondNumber);
        if (firstNumber > secondNumber){
            return positiveMinus;
        }
        else {
            return negativeMinus;
        }
    }

    public static double divide(int firstNumber, int secondNumber) {
        double quotient = (double) firstNumber / secondNumber;
        if(secondNumber == 0){
            return 0;
        }
        else{
            return quotient;
        }

    }

    public static int factor(int number) {
        int factor = 0;
        for (int count = 1; count <= number ; count++) {
            if(number % count == 0){
                factor ++;
            }
        }
         return factor;
    }

    public static boolean square(int number) {
        boolean squareNumber = true;
        int square = 1;
        int counter = 0;
        for (int count = 0; count <= number; count++) {
            if (count * count == number){
                counter++;
            }
        }
        if (counter == 1) {
            return squareNumber;
        }
        return squareNumber;
    }
    public static boolean palindrome(int fiveDigitNumber){
        boolean numberChange = true;
        int reverse = 0;
        int turnNumber = fiveDigitNumber;
        while(fiveDigitNumber != 0) {
           int digit = fiveDigitNumber % 10;
           reverse = reverse * 10 + digit;
           fiveDigitNumber /= 10;
        }
        if (turnNumber == reverse) {
            return numberChange;
        }
        else {
            return false;
        }
    }

    public static int factorial(int number) {
        int factorial = 1;
        int count = 1;
        for (count = 1; count <= number ; count++) {
            factorial = factorial * count;
        }

            return factorial;
    }
}

