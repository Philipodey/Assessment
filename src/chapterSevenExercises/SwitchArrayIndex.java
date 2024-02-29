package chapterSevenExercises;

public class SwitchArrayIndex {
    public static int[][] switchArrayIndex(int[][] numbers){
        int count = 0;
        int counter = 0;
        int hold1 = 0;
        int hold2 = 0;
        int length = numbers.length;
        int[][] array = new int[numbers.length][];


        for (int index = 0; index < numbers.length; index++) {

            count++;


            for (int secondArrayIndex = 0; secondArrayIndex < numbers[index].length; secondArrayIndex++) {
               if (secondArrayIndex == count){
                   hold1 = numbers[index][secondArrayIndex];
                   ++index; --secondArrayIndex;
                   hold2 = numbers[index][secondArrayIndex];
                   index--; secondArrayIndex++;
                   numbers[index][secondArrayIndex] = hold2;
                   index++; secondArrayIndex--;
                   numbers[index][secondArrayIndex] = hold1;
                   count=0;

               }
            }
        }

        return numbers;
    }

}
