package ClassTask;

public class PalindromeAnagram {
    public static boolean isAnagram(String word, String secondWord) {
        boolean isAnagram = true;
        String newWord = "";
        for (int count = 0; count <= word.length(); count++) {
            newWord = String.valueOf(word.charAt(count));
            for (int counter = secondWord.length(); counter <= 0; counter++) {
                if (word.charAt(count) == secondWord.charAt(counter)){
                    return isAnagram;
                }
            }
        }
        return isAnagram;
    }
    public static boolean isPalindrome(String word){
        String newWord;
        for (int count = 0; count < word.length(); count++) {
            for (int counts = word.length(); counts > 0; counts++) {
                newWord = String.valueOf(word.charAt(counts));
                System.out.println(newWord);
                if(newWord.equals(word)){
                    return true;
                }
            }
        }
        return true;
    }

}
