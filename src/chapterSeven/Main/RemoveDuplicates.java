package chapterSeven.Main;

public class RemoveDuplicates {
    public static int[] removeDuplicate(int[] numbers){
        int[] anotherArray = new int[numbers.length];
        int counter = 0;
        for (int count = 0; count < numbers.length; count++) {
            if(numberNotIn(anotherArray, numbers[count])){
                anotherArray[counter] = numbers[count];
                counter++;
            }
        }
         return trimmedArray(anotherArray, counter);
    }

    public static int[] trimmedArray(int[] anotherArray, int counter) {
        int[] trimArray = new int[counter];
        for (int i = 0; i < trimArray.length; i++) {
            trimArray[i] = anotherArray[i];
        }
        return trimArray;
    }

    public static boolean numberNotIn(int[] anotherArray, int number) {
//        boolean notIn = true;
        for (int i : anotherArray) {
            if (number == i) return false;
        }
        return true;
    }
}

