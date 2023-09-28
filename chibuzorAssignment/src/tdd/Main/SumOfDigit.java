package tdd.Main;

public class SumOfDigit {
    public static int sumDigits(int number){
//        int newNumber = number;
        int sumNumber = 0;
        int digits = 0;
        int count = 0;
        int negative = -1;
        while (number != 0) {
            if(number > 0){
                digits = number % 10;
                sumNumber = sumNumber + ((digits));
                number = number / 10;
            }
        }
        return sumNumber;
    }
}
