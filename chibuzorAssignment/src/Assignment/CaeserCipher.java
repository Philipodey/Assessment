package Assignment;

public class CaeserCipher {
    public static void main(String[] args) {
        String encryptedWord = encryptingData("My name is philip and my phone number is 09019539651","2");
        String decryptedWord = decryptingData(encryptedWord,"2");
    }
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz 0123456789";
//    public static int shiftKey = 3;
    public static String encryptingData(String word,String shiftKey){
        word = word.toLowerCase();
        while (!shiftKey.matches("\\d+")){
            System.out.println("Invalid input!\nEnter a valid number greater than 0:\nTry Again: \n");
            break;
        }
        int newShiftKey = Integer.parseInt(shiftKey);
        String encryptedString = "";
        for (int step = 0; step < word.length(); step++) {
            int position = alphabet.indexOf(word.charAt(step));
            int encryptPosition = (newShiftKey + position) % 37;
            char encryptCharacter = alphabet.charAt(encryptPosition);
            encryptedString = encryptedString + encryptCharacter;

        }
        System.out.println(encryptedString);
        return encryptedString;
    }
    public static String decryptingData(String word, String shiftKey){
        word = word.toLowerCase();
        while (!shiftKey.matches("\\d+")){
            System.out.println("Invalid input!\nEnter a valid number greater than 0:\nTry Again: \n");
            break;
        }
        int newShiftKey = Integer.parseInt(shiftKey);

        String decryptedString = "";
        for (int step = 0; step < word.length(); step++) {
            int position = alphabet.indexOf(word.charAt(step));
            int decryptPosition = (position - newShiftKey) % 37;
            while(decryptPosition < 0){
                decryptPosition += alphabet.length();
            }
            char decryptCharacter = alphabet.charAt(decryptPosition);
            decryptedString += decryptCharacter;
        }
        System.out.println(decryptedString);
        return decryptedString;
    }
}
