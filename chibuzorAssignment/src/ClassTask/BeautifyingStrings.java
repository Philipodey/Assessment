package ClassTask;

public class BeautifyingStrings {
    public static String addFullStopToTheTheEndOfAWord(String word){
        boolean stringContainsFullStop = (word.charAt(word.length()-1)+"").equals(".");
        if(!stringContainsFullStop){
            return word+".";
        }
        else{
            return word;
        }
    }
    public static String capitalizeFirstLetterInAWord(String word){
        String output = "";
        String capitalizeFirstCharacter = (word.charAt(0)+"").toUpperCase() + word.substring(1);
        output = output + capitalizeFirstCharacter;

        return output;
    }
    public static String beautifyingStrings(String sentence){
        String output = capitalizeFirstLetterInAWord(addFullStopToTheTheEndOfAWord(sentence));
        return output;
    }

}
