package ClassTask;

public class PalindromeAnagram {
    public static int characterRange = 300;
    public static boolean isAnagram(String word, String secondWord) {
        if(word.length() != secondWord.length()){
            return false;
        }
        int[] charCount = new int[characterRange];
        for (int index = 0; index < word.length(); index++) {
            charCount[word.charAt(index)]++;
            charCount[secondWord.charAt(index)]--;
        }
        for (int index1 = 0; index1 < word.length(); index1++) {
           if (charCount[index1] != 0){
               return false;
           }
        }
        return true;
    }
    public static boolean isPalindrome(String word){
        word = word.toLowerCase();
        int backWard = word.length() - 1;
        int forward = 0;
        while (forward < backWard){
           if(word.charAt(forward) != word.charAt(backWard)){
               return false;
           }
           forward++;
           backWard--;
        }

        return true;
    }

}
