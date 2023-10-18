package classWork;

public class IntegerCountFromArrayOfStrings {
    public static int countNumbers(String[] array) {
        int count = 0;
        String letter;
        for (String character : array) {
            for (int counts = 0; counts < character.length(); counts++) {
                if (
                        character.charAt(counts) == '0' ||
                                character.charAt(counts) == '1' ||
                                character.charAt(counts) == '2' ||
                                character.charAt(counts) == '3' ||
                                character.charAt(counts) == '4' ||
                                character.charAt(counts) == '5' ||
                                character.charAt(counts) == '6' ||
                                character.charAt(counts) == '7' ||
                                character.charAt(counts) == '8' ||
                                character.charAt(counts) == '9') {
                    count++;
                }
            }

        }
        return count;
    }
}