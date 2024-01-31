package leetCode;

public class MergeTwoStringsAlternatively {

    public static String mergeTwoWordsAlternatively(String firstWord, String secondWord){
       int mergeLength = firstWord.length() + secondWord.length();
       String[] mergedStringArray = new String[mergeLength];
       int counter = 0;
       int wordCount = 0;
        if (mergeLength % 2 != 0) {
            for (int count = 0; count < firstWord.length(); count+=1) {
                mergedStringArray[counter] = String.valueOf(firstWord.charAt(count));
                counter += 2;
            }
            counter = 1;
            for (int index = 0; index < secondWord.length(); index++) {
                if (index < firstWord.length()) {
                    mergedStringArray[counter] = String.valueOf(secondWord.charAt(index));
                    counter += 2;
                }
                else {
                    mergedStringArray[counter-1] = String.valueOf(secondWord.charAt(index));
                    counter++;
                }
            }
        }
        else {
            if (firstWord.length() == secondWord.length()) {
                for (int count = 0; count < firstWord.length(); count++) {
                    mergedStringArray[counter] = String.valueOf(firstWord.charAt(count));
                    counter += 2;
                }
                counter = 1;
                for (int index = 0; index < secondWord.length(); index++) {

                    mergedStringArray[counter] = String.valueOf(secondWord.charAt(index));
                    counter += 2;
                }
            }
            else {
                if (firstWord.length() < secondWord.length()) {
                    for (int count = 0; count < firstWord.length(); count++) {
                        mergedStringArray[counter] = String.valueOf(firstWord.charAt(count));
                        counter += 2;
                    }
                    counter = 1;
                    for (int index = 0; index < secondWord.length(); index++) {
                        if (index < firstWord.length()) {
                            mergedStringArray[counter] = String.valueOf(secondWord.charAt(index));
                            counter += 2;
                        } else {
                            mergedStringArray[counter - 1] = String.valueOf(secondWord.charAt(index));
                            counter++;
                        }
                    }
                }
                else {
                    for (int count = 0; count < firstWord.length(); count++) {
                        if (count <= secondWord.length()){
                            mergedStringArray[counter] = String.valueOf(firstWord.charAt(count));
                            counter +=2;
                        }
                        else {
                            mergedStringArray[counter-1] = String.valueOf(firstWord.charAt(count));
                            counter +=2;
                        }
                    }
                    counter = 1;
                    for (int index = 0; index < secondWord.length(); index++) {
                        mergedStringArray[counter] = String.valueOf(secondWord.charAt(index));
                        counter +=2;
                    }
                }
            }
        }return turnArrayToString(mergedStringArray);
    }

    private static String turnArrayToString(String[] mergedStringArray) {
        String word = "";
        for (int count = 0; count < mergedStringArray.length; count++) {
            word += mergedStringArray[count];
        }
        return word;
    }
}