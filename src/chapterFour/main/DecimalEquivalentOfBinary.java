package chapterFour.main;

public class DecimalEquivalentOfBinary {
    public void decimalToInteger(int number){
        int decimal = 0;
        int digit = 0;
        int count = 0;
        int power = 0;
        int base = 2;
        while (number != 0){
            digit = number % 10;
            decimal += digit * 2;
            number = number / 10;;
            count++;
        }
        System.out.printf("The decimal equivalent of %d is %d",number, decimal);
    }

}