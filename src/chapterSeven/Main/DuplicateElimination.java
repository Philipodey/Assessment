package chapterSeven.Main;

public class DuplicateElimination {
    public static int[] createArrayAndInitializeItToMinusOne(int[] integer){
        for (int count = 0; count < integer.length; count++) {
            integer[count] = -1;
        }
        return integer;
    }
    public static int[] turnDuplicateToMinusOne(int[] array){
        int counter = 0;
        for (int count = 0; count < array.length; count++) {
            for (int counts = count + 1; counts < array.length; counts++) {
                if (array[count] == array[counts]) array[counts] = -1;
            }
        }
        int countMinusOneNumbers = countNumberOfMinusOne(array);
        return removeNonMinusOneNumbers(array,countMinusOneNumbers);
    }
    public static int countNumberOfMinusOne(int[] array){
        int counter = 0;
        for (int count = 0; count < array.length; count++) {
            if (array[count] == -1) counter++;

        }
        return counter;
    }

    public static int[] removeNonMinusOneNumbers(int[] integer, int length) {
        int counter = 0;
        int[] array  = new int[length];

        for (int count = 0; count < integer.length; count++) {
            if (integer[count] == -1)
                array[counter] = integer[count];
            counter++ ;      }
        return integer;
    }
}
