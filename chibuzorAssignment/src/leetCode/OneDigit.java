package leetCode;

public class OneDigit {
    public static int addDigitUntilOneDigitLeft(int number){
        String convertedNumber = String.valueOf(number);
        int numberLength = convertedNumber.length();
        int addedNumber = 0;
        int counter = 0;
        String oneDigit ;
        for (int count = 0; count < numberLength; count++) {
            addedNumber += Integer.parseInt(String.valueOf(convertedNumber.charAt(count)));
        }
        oneDigit = String.valueOf(addedNumber);
        addedNumber = 0;
        while (counter < oneDigit.length()){

            addedNumber += Integer.parseInt(String.valueOf(oneDigit.charAt(counter)));
            counter++;
        }

        return addedNumber;
    }
}
