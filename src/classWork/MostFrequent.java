package classWork;

public class MostFrequent {
    public static int mostFrequentlyOccurredNumber(int[] number){
        int mostFrequent = 0;
        int indexCounter = 0;
        int indexCount = 0;
        int [] anotherNumber = new int[number.length];
        for(int count = 0; count < number.length; count++){
            for (int counter = 0; counter < number.length; counter++) {
                if (number[count] == number[counter]) {
                    indexCount++;
                }
            }
            if (indexCount > indexCounter) {
                mostFrequent = number[count];
            }
            indexCounter = indexCount;
            indexCount = 0;
        }

        return mostFrequent;
    }
}
