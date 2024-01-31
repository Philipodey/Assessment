package classWork;

public class PlusOne {
    public static int[] plusOne(int[] numberArray){
        String stringConvert = "";
        for (int count =0; count < numberArray.length ; count++) {
           stringConvert += numberArray[count];
        }
         int number = Integer.parseInt(stringConvert)+1;
         String wordNumber = String.valueOf(number);
        return convertStringToNumberArray(wordNumber);

    }

    public static int[] convertStringToNumberArray(String wordNumber){
        int[] plusOneNumbers = new int[wordNumber.length()];
        for (int count = 0; count < wordNumber.length(); count++) {
            int number = Integer.parseInt(String.valueOf(wordNumber.charAt(count)));
            plusOneNumbers[count] = number;
        }
        return plusOneNumbers;
    }
}
